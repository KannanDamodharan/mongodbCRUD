package com.example.demo.service;

import com.example.demo.model.Hamburger;
import com.example.demo.repository.HamburgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamburgerService {

    @Autowired
    private HamburgerRepository hamburgerRepository;

    public String saveHamburger(Hamburger hamburger){
        System.out.println("Hello service Save");
        hamburgerRepository.save(hamburger);
        return "id is "+ hamburger.getId();
    }

    public List<Hamburger> getHamburgers(){
        return hamburgerRepository.findAll();
    }
}
