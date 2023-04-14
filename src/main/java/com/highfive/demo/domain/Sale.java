package com.highfive.demo.domain;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "sale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSale;

    @Column(name = "created")
    private String created;

    @Column(name = "created_by")
    private String createds;

    @Column(name = "price")
    private Float price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car")
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer")
    private Customer customer;

}
