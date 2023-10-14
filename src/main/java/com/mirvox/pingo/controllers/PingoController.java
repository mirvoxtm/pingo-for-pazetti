package com.mirvox.pingo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PingoController {
    @GetMapping("/transparency")
    public String transparency() {
        return "transparency";
    }
    
    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
