package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public Optional<Person> getPersonById(@PathVariable("id") Long id)
    {
        return personService.findById(id);
    }

    @GetMapping("/person/")
    public List<Person> getAllPerson() { return personService.findAll(); }

    @PostMapping("/person/create")
    public Person createPerson(@RequestBody Person person) { return personService.save(person); }

    @PostMapping("/person/delete/{id}")
    public void deletePersonById(@PathVariable("id") Long id) { personService.deleteById(id); }

    @PostMapping("/person/update/")
    public Person updatePerson(@RequestBody Person person) { return personService.update(person); }
}