package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Car;
import com.highfive.demo.domain.Customer;
import com.highfive.demo.domain.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    //boolean existsByCreatedAndCreateds(String created, String createds);

   //Optional<Sale> findByCreatedAndCreatedsAndPriceAndCustomerAndCar(String created, String createds, Float price, Customer customer, Car car);
}
