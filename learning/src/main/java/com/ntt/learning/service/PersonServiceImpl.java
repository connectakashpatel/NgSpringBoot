package com.ntt.learning.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ntt.learning.dao.PersonRepo;
import com.ntt.learning.model.Person;

public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepo repo;
	
	@Override
	public void save(Person person) {
	
		repo.save(person);
		
	}

	@Override
	public void delete(int id) {

		repo.deleteById(id);
		
	}

}
