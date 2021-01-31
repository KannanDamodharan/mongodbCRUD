package com.example.demo.controller;

import com.example.demo.model.Hamburger;
import com.example.demo.service.HamburgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HamburgerController {
    @Autowired
    private HamburgerService hamburgerService;

    @PostMapping("/addHamburger")
    public String saveHamburger(@RequestBody Hamburger hamburger){
        System.out.println("Hello Save");
        return hamburgerService.saveHamburger(hamburger);
    }

    @GetMapping("/findHamburgers")
    public List<Hamburger> getHamburgers(){
        return hamburgerService.getHamburgers();
    }
}
