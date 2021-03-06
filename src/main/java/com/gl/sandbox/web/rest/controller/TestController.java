package com.gl.sandbox.web.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "hello", "" })
public class TestController {

    @GetMapping("/{name}")
    public ResponseEntity<String> getHello(@PathVariable String name) {
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
}
