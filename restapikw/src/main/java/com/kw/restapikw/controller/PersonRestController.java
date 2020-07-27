package com.kw.restapikw.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kw.restapikw.model.Person;
import com.kw.restapikw.services.PersonService;

/**
 * This rest controller helps to write REST API Controller.
 * 
 * @author dknitk
 *
 */
@RestController
public class PersonRestController {
	
	@Autowired
	PersonService personService;
			
	/**
	 * This method helps to retrieve the single person data.
	 * 
	 * @return List<Person>
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@GetMapping("/personObj")
	public List<Person> getPersonObjData() throws JsonParseException, JsonMappingException, IOException {		

		List<Person> persons = new ArrayList<Person>();
		
		persons.add(personService.getPersonJsonData());
		
		return persons;
	}
	
	/**
	 * This method helps to retrieve the multiple person data.
	 * 
	 * @return List<Person>
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@GetMapping("/personsObj")
	public List<Person> getPersonsObjData() throws JsonParseException, JsonMappingException, IOException {		

		return personService.getPersonJsonDataList();
	}

}
