package com.study.examples.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/some")
@RequiredArgsConstructor
public class SomeController {

    @GetMapping("/world")
    public String someMethod() {
        return "Hello, world!";
    }
}
