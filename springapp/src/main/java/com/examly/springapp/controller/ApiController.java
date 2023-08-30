package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Car;
import com.examly.springapp.service.Apiservice;

@RestController
public class ApiController {


    @Autowired
    public Apiservice api;

    @PostMapping("/")
    public boolean addCar(@RequestBody Car car){
        return api.add(car);
    }
    
    
}
