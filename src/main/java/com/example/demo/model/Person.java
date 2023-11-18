package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Person {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personId;

    @Getter
    private String name;

    @Getter
    @Setter
    private String email;

    public Person() {}

    public Person(String name)
    {
        this.name = name;
    }

    public Person(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public String toString()
    {
        return this.name;
    }
}
