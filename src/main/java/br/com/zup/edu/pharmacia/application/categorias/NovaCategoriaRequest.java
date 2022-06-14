package br.com.zup.edu.pharmacia.application.categorias;

import static com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;

public class NovaCategoriaRequest {

    @NotBlank
    private String nome;

    @JsonCreator(mode = PROPERTIES)
    public NovaCategoriaRequest(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
