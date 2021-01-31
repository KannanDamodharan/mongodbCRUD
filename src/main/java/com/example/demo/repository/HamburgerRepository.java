package com.example.demo.repository;

import com.example.demo.model.Hamburger;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface HamburgerRepository extends MongoRepository<Hamburger, Integer> {

}
