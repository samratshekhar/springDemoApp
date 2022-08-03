package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Screen;
import com.example.demo.service.ScreenService;

@RestController
public class DemoController {

    @Autowired
    ScreenService screenService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/getAllScreens")
    public Collection<Screen> getAllScreens() {
        return screenService.getAllScreens();
    }

    @GetMapping("/getAllScreens")
    public Collection<Screen> saveScreens() {
        return screenService.getAllScreens();
    }
    
}
