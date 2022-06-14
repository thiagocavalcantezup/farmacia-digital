package br.com.zup.edu.pharmacia.application.remedios;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.zup.edu.pharmacia.domain.remedios.CriaNovoRemedio;
import br.com.zup.edu.pharmacia.domain.remedios.Remedio;

@RestController
@RequestMapping("/remedios")
public class CadastraRemedioController {

    private final CriaNovoRemedio service;

    public CadastraRemedioController(CriaNovoRemedio service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoRemedioRequest request,
                                      UriComponentsBuilder uriBuilder) {
        Remedio remedio = service.cadastraNovoRemedio(request);

        URI location = uriBuilder.path("/remedios/{id}").buildAndExpand(remedio.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
