package com.gft.treinamento.services;

import org.springframework.stereotype.Service;

import com.gft.treinamento.entities.Person;

@Service
public class PersonService {
	public Person createPerson() {
		Person person = new Person();
		person.setNome("David");
		person.setAge(30);
		person.setStatus(Boolean.FALSE);
		
		return person;
	}
}
