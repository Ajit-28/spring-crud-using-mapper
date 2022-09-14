package com.springboot.crud.person_crud.services;

import com.springboot.crud.person_crud.dto.Persondto;
import com.springboot.crud.person_crud.entities.PersonEntity;
import com.springboot.crud.person_crud.mapper.PersonMapper;
import com.springboot.crud.person_crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonMapper personMapper;


    public PersonEntity savePerson(Persondto persondto) {
        return personRepository.save(personMapper.toPersonEntity(persondto));
    }
}
