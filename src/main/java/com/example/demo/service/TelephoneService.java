package com.example.demo.service;

import com.example.demo.model.Telephone;
import com.example.demo.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelephoneService {
    @Autowired
    private TelephoneRepository telephoneRepository;

    public List<Telephone> findAll()
    {
        return telephoneRepository.findAll();
    }

    public List<Telephone> findByPersonId(Long personId)
    {
        return telephoneRepository.findTelephonesByPerson_PersonId(personId);
    }

    private Optional<Telephone> findById(Long telId)
    {
        return telephoneRepository.findById(telId);
    }

    public Telephone save(Telephone telephone)
    {
        return telephoneRepository.save(telephone);
    }

    public void deleteById(Long telId)
    {
        telephoneRepository.deleteById(telId);
    }

    public Telephone update(Telephone telephone)
    {
        Telephone telNew = new Telephone(telephone.getTelNumber(), telephone.getPerson());
        deleteById(telephone.getTelId());
        return save(telNew);
    }
}
