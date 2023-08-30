package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Car;
import com.examly.springapp.repository.CarRepo;

@Service
public class Apiservice {

    @Autowired
    public CarRepo repo;

    public boolean add(Car car){
        return repo.save(car)!=null?true:false;
    }
    
    
}
