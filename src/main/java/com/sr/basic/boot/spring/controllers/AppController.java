package com.sr.basic.boot.spring.controllers;

import com.sr.basic.boot.spring.model.response.Greet;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1")
public class AppController {
    @GetMapping(value = "/greet", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Greet> greetings() {
        Greet greet = new Greet.GreetBuilder().setMessage("Welcome to the jungle").build();
        return ResponseEntity.ok(greet);
    }
}
