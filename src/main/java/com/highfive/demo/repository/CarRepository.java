package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Car;
import com.highfive.demo.domain.Engine;
import com.highfive.demo.domain.Feature;
import com.highfive.demo.domain.Sale;

import ch.qos.logback.core.model.Model;

public interface CarRepository extends JpaRepository<Car, Long> {
    
    boolean existsByNameAndPrice(String name, Float price);


    Optional<Car> findByNameAndPriceAndModelAndSalesAndEnginesAndFeatures(String name, Float price, Model model, Sale sales, Engine engines, Feature features);
}
