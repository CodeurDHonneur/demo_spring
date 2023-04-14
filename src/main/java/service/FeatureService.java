package service;

import java.util.Optional;

import com.highfive.demo.domain.Feature;
import com.highfive.demo.repository.FeatureRepository;

public class FeatureService extends CrudService<Feature, Long> {
    private final FeatureRepository featureRepository;

    public FeatureService(FeatureRepository featureRepository) {
        super(featureRepository);
        this.featureRepository = featureRepository;
    }

    public Feature create(Feature feature) {
        if(featureRepository.existsByName(feature.getName())) {
            throw new IllegalArgumentException("Cette option '" + feature.getName() + "' existe déjà.");
        }
        return super.create(feature);
    }

    public Optional<Feature> get(String name) {
        return featureRepository.findByName(name);
    }
}
