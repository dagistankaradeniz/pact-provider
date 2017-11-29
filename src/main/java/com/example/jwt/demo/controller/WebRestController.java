package com.example.jwt.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@Slf4j
@RestController(value = "/")
public class WebRestController {

    private String uuid = UUID.randomUUID().toString();

    @GetMapping("/")
    public String getUuid() {
        log.info("Getting uuid: {}", uuid);
        return uuid;
    }
}
