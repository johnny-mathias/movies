package br.com.fiap.movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {


    @GetMapping("/")
    public String healthCheck() {
        return "<h1>Server UP<h1>";
    }

}
