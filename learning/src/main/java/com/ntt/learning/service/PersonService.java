package com.ntt.learning.service;

import com.ntt.learning.model.Person;

public interface PersonService {
	
	public void save(Person person);
	public void delete(int id);

}
