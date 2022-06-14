package br.com.zup.edu.pharmacia.adapters.persistence.farmaceuticas;

import org.springframework.stereotype.Component;

import br.com.zup.edu.pharmacia.domain.farmaceuticas.CadastraNovaFarmaceuticaRepository;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

@Component
public class SqlFarmaceuticaAdapter implements CadastraNovaFarmaceuticaRepository {

    private final FarmaceuticaRepository repository;

    public SqlFarmaceuticaAdapter(FarmaceuticaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Farmaceutica salva(Farmaceutica farmaceutica) {
        return repository.save(farmaceutica);
    }

}
