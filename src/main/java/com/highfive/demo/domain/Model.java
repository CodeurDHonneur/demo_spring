package com.highfive.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "model")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //à mettre lorsque nous sommes entrain d'utiliser MySQL
    private Long id;

    @Column(name = "name")
    private String name;

    /*
     * Pour spécifier une relation de plusieurs a un(plusieurs models pour une marque)
     * EAGER va faire un select avec un INNER JOIN
     * LAZY va faire un select simple de ce dont il a besoin à chaque fois
     */

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand")
    private Brand brand;

    /*
     * pour spécifier une méthode ou un champ qui doit être ignoré lors des processus de sérialisation et de désérialisation
     * 
     * 
     * Nous appliquons souvent cette annotation pour exclure les champs qui peuvent ne pas être pertinents ou qui pourraient contenir des informations sensibles. Nous l'utilisons sur un champ ou une méthode pour marquer une propriété que nous aimerions ignorer.
     */
}
