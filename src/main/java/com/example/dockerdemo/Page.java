package com.example.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Page {
    @GetMapping
    public String deneme2() {
        return "YUSUF ÖDEV o";
    }
}
