package com.docker.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class test {
    @GetMapping("/test")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("O teste funcionou!");
    }
}
