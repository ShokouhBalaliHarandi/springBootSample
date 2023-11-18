package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> findAll()
    {
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long personId) {
        return personRepository.findById(personId);
    }

    public Person save(Person person)
    {
        return personRepository.save(person);
    }

    public Person update(Person person)
    {
        Person personTmp = findById(person.getPersonId()).orElseThrow();
        personTmp.setEmail(person.getEmail());
        personRepository.save(personTmp);
        return personTmp;
    }

    public void deleteById(Long personId)
    {
        personRepository.deleteById(personId);
    }
}