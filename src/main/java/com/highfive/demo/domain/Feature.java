package com.highfive.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table( name = "feature")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Feature {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFeature;

    @Column(name = "name")
    private String name;

}
