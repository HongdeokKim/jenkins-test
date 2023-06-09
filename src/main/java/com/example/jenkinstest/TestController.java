package com.example.jenkinstest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("test/")
public class TestController {

    @GetMapping("hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello");
    }

    @GetMapping("bye")
    public ResponseEntity<String> bye() {
        return ResponseEntity.status(HttpStatus.OK)
                .body("bye");
    }

    @GetMapping("wow")
    public ResponseEntity<String> wow() {
        return ResponseEntity.status(HttpStatus.OK)
                .body("wow");
    }

}
