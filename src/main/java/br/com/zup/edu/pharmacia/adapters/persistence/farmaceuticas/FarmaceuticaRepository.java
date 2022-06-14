package br.com.zup.edu.pharmacia.adapters.persistence.farmaceuticas;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

public interface FarmaceuticaRepository extends JpaRepository<Farmaceutica, Long> {

}
