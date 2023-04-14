package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Engine;

public interface EngineRepository extends JpaRepository<Engine, Long> {
    boolean exitsByNameAndType(String name, String type); 
    
    Optional<Engine> findByName(String name);
    Optional<Engine> findByNameAndType(String name, String type);
}
