package com.example.pact.provider.controller;

import com.example.pact.provider.domain.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController(value = "/")
public class WebRestController {
    @GetMapping(value = "/uuid/{uuid}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getUuid(@PathVariable("uuid") String uuid) {
        log.info("Getting and returning uuid: {}", uuid);
        return uuid.substring(0,2);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Person createPerson() {
        return Person.builder().name("Harald Hårfagre").ssn("01039012345").build();
    }
}
