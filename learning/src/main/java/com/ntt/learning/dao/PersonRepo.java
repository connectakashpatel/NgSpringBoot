package com.ntt.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntt.learning.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
