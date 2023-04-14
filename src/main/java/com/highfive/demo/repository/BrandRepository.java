package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Brand;

public interface BrandRepository  extends JpaRepository<Brand, Long>{
    boolean existsByName(String name);
    //l'objectif ici est de s'assurer de ne pas avoir deux fois une même marque dans notre bdd

    Optional<Brand> findByName(String name);
    //le mot "Optional", permet lors de la recherche, de ne pas renvoyer une erreur au cas où on ne trouvait rien commme données correspondantes dans le bdd

    
}
