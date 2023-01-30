package com.redouane.RedouaneDemo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redouane.RedouaneDemo.persistence.entity.PersonEntity;
import com.redouane.RedouaneDemo.persistence.repository.PersonRepository;

@RestController
@RequestMapping("/api/person")
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonRepository personRepo;

    @GetMapping
    public ResponseEntity<List<PersonEntity>> getPerson() {
        return ResponseEntity.ok(personRepo.findAll());
    }

    @GetMapping("/name")
    public ResponseEntity<List<PersonEntity>> getPersonByName(String name) {
        return ResponseEntity.ok(personRepo.findByNameIgnoreCase(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonEntity> getPerson(@PathVariable int id) {
        Optional<PersonEntity> e = personRepo.findById(id);
        return e.isPresent() ? ResponseEntity.ok(e.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id) {
        personRepo.deleteById(id);
    }

    @PostMapping
    public PersonEntity ceratePerson(@RequestBody PersonEntity entity) {
        return personRepo.save(entity);
    }

    @PutMapping
    public ResponseEntity<PersonEntity> updatePerson(@RequestBody PersonEntity entity) {
        Optional<PersonEntity> e = personRepo.findById(entity.getId());
        return e.isPresent() ? ResponseEntity.ok(personRepo.save(entity)) : ResponseEntity.notFound().build();
    }

}
