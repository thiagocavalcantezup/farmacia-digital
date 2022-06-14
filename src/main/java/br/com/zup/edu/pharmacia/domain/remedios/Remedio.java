package br.com.zup.edu.pharmacia.domain.remedios;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

@Entity
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @ManyToOne(optional = false)
    private Farmaceutica fabricante;

    @ManyToOne(optional = false)
    private Categoria categoria;

    @NotNull
    @PastOrPresent
    private LocalDate dataFabricacao;

    @NotNull
    @Future
    private LocalDate dataValidade;

    /**
     * @deprecated Construtor de uso exclusivo do Hibernate
     */
    @Deprecated
    public Remedio() {}

    public Remedio(String nome, Farmaceutica fabricante, Categoria categoria,
                   LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public Long getId() {
        return id;
    }

}
