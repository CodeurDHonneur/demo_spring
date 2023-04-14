package com.highfive.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
//import java.util.ArrayList;
//import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCustomer;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    /*
     * Pas pris en compte par Josué
     * 
     *  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
     * private List<Sale> sales = new ArrayList<>();
     */
   
    
}
