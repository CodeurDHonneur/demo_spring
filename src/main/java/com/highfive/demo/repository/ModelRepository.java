package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Brand;
import com.highfive.demo.domain.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {
    boolean existsByNameAndBrand(String name, Brand brand);

    Optional<Model> findByNameAndBrand(String name, Brand brand);

}
