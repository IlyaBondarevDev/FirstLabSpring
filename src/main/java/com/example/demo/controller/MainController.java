package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello() { return "Hello, Ilya Bondarev, today is " + LocalDate.now().toString(); }

}
