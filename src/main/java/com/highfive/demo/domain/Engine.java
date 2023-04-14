package com.highfive.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "engine")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Engine {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEngine;

    @Column(name = "name")
    private String name;

    /*
     * pour le type "ENUM", il faut mettre l'annotation "enumerated" et spécifier le type
     */
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private String type;

}
