package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Telephone {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telId;

    @Getter
    private long telNumber;

    @Getter
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    public Telephone()
    {

    }

    public Telephone(Long telNumber, Person person) {
        this.telNumber = telNumber;
        this.person = person;
    }
}
