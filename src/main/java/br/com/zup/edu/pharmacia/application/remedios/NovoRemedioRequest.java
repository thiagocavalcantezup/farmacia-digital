package br.com.zup.edu.pharmacia.application.remedios;

import static com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import br.com.zup.edu.pharmacia.domain.remedios.DadosRemedio;
import br.com.zup.edu.pharmacia.domain.remedios.Remedio;

public class NovoRemedioRequest implements DadosRemedio {

    @NotBlank
    private String nome;

    @NotNull
    private Long fabricanteId;

    @NotNull
    private Long categoriaId;

    @NotNull
    @PastOrPresent
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFabricacao;

    @NotNull
    @Future
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataValidade;

    @JsonCreator(mode = PROPERTIES)
    public NovoRemedioRequest(String nome, Long fabricanteId, Long categoriaId,
                              LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.fabricanteId = fabricanteId;
        this.categoriaId = categoriaId;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    @Override
    public Remedio toModel() {
        return new Remedio(
            nome, new Farmaceutica(fabricanteId), new Categoria(categoriaId), dataFabricacao,
            dataValidade
        );
    }

}
