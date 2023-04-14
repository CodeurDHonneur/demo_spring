package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
    boolean existsByName(String name);
    Optional<Feature> findByName(String name);
}
