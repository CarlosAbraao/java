package com.desenvolvecarlos.SpringBoot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RETORNA SOMENTE TEXTO
public class HelloController {

    @GetMapping ("/")
    public String helloMessage(){

        return "Hello, Turma da programação";
    }
}
