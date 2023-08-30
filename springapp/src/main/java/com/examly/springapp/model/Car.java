package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    int carId;
    String carName;
    String carType;
    int Owners;
    String curretOwnerName;
    long mobile;
    String address;


    public Car() {
    }


    public Car(int carId, String carName, String carType, int owners, String curretOwnerName, long mobile,
            String address) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        Owners = owners;
        this.curretOwnerName = curretOwnerName;
        this.mobile = mobile;
        this.address = address;
    }


    public int getCarId() {
        return carId;
    }


    public void setCarId(int carId) {
        this.carId = carId;
    }


    public String getCarName() {
        return carName;
    }


    public void setCarName(String carName) {
        this.carName = carName;
    }


    public String getCarType() {
        return carType;
    }


    public void setCarType(String carType) {
        this.carType = carType;
    }


    public int getOwners() {
        return Owners;
    }


    public void setOwners(int owners) {
        Owners = owners;
    }


    public String getCurretOwnerName() {
        return curretOwnerName;
    }


    public void setCurretOwnerName(String curretOwnerName) {
        this.curretOwnerName = curretOwnerName;
    }


    public long getMobile() {
        return mobile;
    }


    public void setMobile(long mobile) {
        this.mobile = mobile;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    
    


    
    
}
