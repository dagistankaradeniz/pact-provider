package com.example.pact.provider.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping
public class WebRestController {

    @Autowired
    private PersonRepository personRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/v1/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Person createPerson(@RequestBody Person person) {
        personRepository.add(person);
        return person;
    }
}