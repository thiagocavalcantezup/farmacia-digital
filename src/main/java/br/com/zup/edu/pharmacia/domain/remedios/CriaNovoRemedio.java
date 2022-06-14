package br.com.zup.edu.pharmacia.domain.remedios;

import org.springframework.stereotype.Service;

@Service
public class CriaNovoRemedio {

    private final CadastraNovoRemedioRepository repository;

    public CriaNovoRemedio(CadastraNovoRemedioRepository repository) {
        this.repository = repository;
    }

    public Remedio cadastraNovoRemedio(DadosRemedio dados) {
        Remedio remedio = dados.toModel();

        return repository.salva(remedio);
    }

}
