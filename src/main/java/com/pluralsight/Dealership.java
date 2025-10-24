package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String dealershipName, address, phoneNum;
    private ArrayList<Vehicle> inventory;

    public Dealership(String dealershipName, String address, String phoneNum) {
        this.inventory = new ArrayList<>();

        this.dealershipName = dealershipName;
        this.address = address;
        this.phoneNum = phoneNum;


    }

    public String getDealershipName() {
        return dealershipName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {

        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {

        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {


        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {

        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {

        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {

        return null;
    }

    public List<Vehicle> getAllVehicles() {

        return inventory;
    }

    public void addVehicle(Vehicle vehicle) {

        this.inventory.add(vehicle);
    }

    public void  removeVehicle(Vehicle vehicle) {

     this.inventory.remove(vehicle);
    }
}
