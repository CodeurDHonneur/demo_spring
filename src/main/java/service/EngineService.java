package service;

import java.util.Optional;

import com.highfive.demo.domain.Engine;
import com.highfive.demo.repository.EngineRepository;

public class EngineService extends CrudService<Engine, Long>{
    private final EngineRepository engineRepository;

    public EngineService(EngineRepository engineRepository) {
        super(engineRepository);
        this.engineRepository = engineRepository;
    }

    public Engine create(Engine engine) {
        if(engineRepository.exitsByNameAndType(engine.getName(), engine.getType())) {
            throw new IllegalArgumentException("Ce moteur '" + engine.getName() + "' '" +  engine.getType() + "' existe déjà");
        }
        return super.create(engine);
    }

    public Optional<Engine> get(String name) {
        return engineRepository.findByName(name);
    }

    public Optional<Engine> get(String name, String type) {
        return engineRepository.findByNameAndType(name, type);
    }
}
