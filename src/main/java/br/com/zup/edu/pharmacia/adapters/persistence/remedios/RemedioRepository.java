package br.com.zup.edu.pharmacia.adapters.persistence.remedios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {

}
