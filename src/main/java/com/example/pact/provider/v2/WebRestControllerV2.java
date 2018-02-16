package com.example.pact.provider.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping(value = "/person/v2")
public class WebRestControllerV2 {

    @Autowired
    private PersonRepositoryV2 personRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PersonV2 createPerson(@RequestBody PersonV2 person) {
        personRepository.add(person);
        return person;
    }
}
