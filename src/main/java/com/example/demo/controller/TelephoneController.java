package com.example.demo.controller;

import com.example.demo.model.Telephone;
import com.example.demo.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TelephoneController {

    @Autowired
    private TelephoneService telephoneService;

    @GetMapping("/Telephone/")
    public List<Telephone> getAllTelephones()
    {
        return telephoneService.findAll();
    }

    @GetMapping("/Telephone/{personId}")
    public List<Telephone> getTelephoneByPerson(@PathVariable("personId") Long personId)
    {
        return telephoneService.findByPersonId(personId);
    }

    @PostMapping("/Telephone/create")
    public Telephone createTelephone(@RequestBody Telephone telephone)
    {
        return telephoneService.save(telephone);
    }

    @PostMapping("/Telephone/delete/{id}")
    public void createTelephone(@PathVariable("id") Long id)
    {
        telephoneService.deleteById(id);
    }

    @PostMapping("/Telephone/update")
    public Telephone updateTelephone(@RequestBody Telephone telephone)
    {
        return telephoneService.update(telephone);
    }
}
