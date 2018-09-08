package com.myshop.domain.Clothes;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Tshirt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private int size;

    @NotNull
    private String manufacturer;

    public Tshirt(String name, Double price, int size, String manufacturer) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.manufacturer = manufacturer;
    }
}
