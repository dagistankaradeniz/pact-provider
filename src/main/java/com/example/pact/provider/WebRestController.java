package com.example.pact.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController(value = "/")
public class WebRestController {

    private static int ID_COUNTER = 1;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Person createPerson(@RequestBody Person person) {
        SsnValidator.validate(person.getSsn());

        person.setId(ID_COUNTER++);
        return person;
    }
}
