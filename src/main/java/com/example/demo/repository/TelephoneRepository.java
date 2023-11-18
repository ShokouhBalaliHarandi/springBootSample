package com.example.demo.repository;

import com.example.demo.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelephoneRepository extends JpaRepository<Telephone, Long> {

    public List<Telephone> findTelephonesByPerson_PersonId(Long Id);
}
