package com.redouane.RedouaneDemo.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redouane.RedouaneDemo.persistence.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

    List<PersonEntity> findByNameIgnoreCase(String name);

  //  List<PersonEntity> findByBirthDateIsBefore(LocalDate date);

}
