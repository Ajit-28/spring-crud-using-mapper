package com.springboot.crud.person_crud.mapper;

import com.springboot.crud.person_crud.dto.Persondto;
import com.springboot.crud.person_crud.entities.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Persondto toPersonDTO(PersonEntity personEntity);

    PersonEntity toPersonEntity(Persondto persondto);
}
