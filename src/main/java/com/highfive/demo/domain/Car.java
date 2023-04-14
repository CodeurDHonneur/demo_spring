package com.highfive.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;

    //Dans le code de Josué, il n'a pas mis le "fetch"
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "model")
    private Model model;
    
    @Column(name = "price")
    //dans mon code, j'ai utilisé un "float" mais Josué lui a utilisé un "BigDecimal"
    private BigDecimal price;
    @JsonIgnore
    @ManyToMany 
    @JoinTable( name = "carengine",
                joinColumns = @JoinColumn( name = "idCar"),
                inverseJoinColumns = @JoinColumn( name = "idEngine"))
    private Set<Engine> engines = new HashSet<>();

    /*
     * Josué n'a pas pris cela en compte
     * 
     *  @Column(name = "name")
     * private String name;
     * 
     */
   
    
    
    @ManyToMany
    @JoinTable( name = "carfeature",
                joinColumns = @JoinColumn( name = "idCar"),
                inverseJoinColumns = @JoinColumn( name = "idFeature"))
    private Set<Car> features = new HashSet<>();
    


    /*@OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Sale> sales = new ArrayList<>();*/



    
}

