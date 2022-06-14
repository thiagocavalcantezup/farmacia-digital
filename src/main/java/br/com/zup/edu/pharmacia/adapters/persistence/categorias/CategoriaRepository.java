package br.com.zup.edu.pharmacia.adapters.persistence.categorias;

import org.springframework.data.repository.CrudRepository;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}
