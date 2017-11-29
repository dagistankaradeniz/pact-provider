package com.example.pact.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController(value = "/")
public class WebRestController {
    @GetMapping(value = "/uuid/{uuid}")
    public String getUuid(@PathVariable("uuid") String uuid) {
        log.info("Getting and returning uuid: {}", uuid);
        return uuid.substring(0,2);
    }
}
