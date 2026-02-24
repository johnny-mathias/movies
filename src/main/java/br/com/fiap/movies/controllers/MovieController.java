package br.com.fiap.movies.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MovieController {

    public String healthCheck() {
        return "Server UP";
    }

}
