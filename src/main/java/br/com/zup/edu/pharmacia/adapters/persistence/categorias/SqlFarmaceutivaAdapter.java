package br.com.zup.edu.pharmacia.adapters.persistence.categorias;

import br.com.zup.edu.pharmacia.adapters.persistence.farmaceuticas.FarmaceuticaRepository;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.CadastraNovaFarmaceuticaRepository;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import org.springframework.stereotype.Component;

@Component
public class SqlFarmaceutivaAdapter implements CadastraNovaFarmaceuticaRepository {

    private final FarmaceuticaRepository repository;

    public SqlFarmaceutivaAdapter(FarmaceuticaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Farmaceutica salva(Farmaceutica farmaceutica) {
        return repository.save(farmaceutica);
    }

}
