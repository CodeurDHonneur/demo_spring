package com.highfive.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.demo.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    boolean existsByPhone (String phone); 
    Optional<Customer> findByPhone (String phone); 
    Optional<Customer> findByName (String name);
    //boolean existsByNameAndPhone(String name, String phone);
    //Optional<Customer> findByNameAndPhone(String name, String phone);
}
