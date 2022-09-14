package com.springboot.crud.person_crud.controllers;

import com.springboot.crud.person_crud.dto.Persondto;
import com.springboot.crud.person_crud.entities.PersonEntity;
import com.springboot.crud.person_crud.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    @Autowired
    PersonService personService;


    @PostMapping
    public ResponseEntity<PersonEntity> saveContact(@RequestBody Persondto persondto){
        return ResponseEntity.ok(personService.savePerson(persondto));
    }

}
