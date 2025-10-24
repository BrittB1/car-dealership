package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = null;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"))) {

            String dealershipInfo = reader.readLine();
            String[] parts = dealershipInfo.split("\\|");

            String dealershipName = parts[0].trim();
            String address = parts[1];
            String phoneNum = parts[2];

            dealership = new Dealership(dealershipName, address, phoneNum);

            String line;

            while ((line = reader.readLine()) != null) {
                String[] vehicleInfo = line.split("\\|");

                if (vehicleInfo.length == 8) {

                    int vin = Integer.parseInt(vehicleInfo[0]);
                    int year = Integer.parseInt(vehicleInfo[1]);
                    String make = vehicleInfo[2];
                    String model = vehicleInfo[3];
                    String vehicleType = vehicleInfo[4];
                    String color = vehicleInfo[5];
                    int odometer = Integer.parseInt(vehicleInfo[6]);
                    double price = Double.parseDouble(vehicleInfo[7]);

                    Vehicle vehicle = new Vehicle(vin, year, odometer, make, model, color, vehicleType, price);
                    dealership.addVehicle(vehicle);
                }

            }
        } catch (IOException e) {
            System.out.println("Error reading file!" + e.getMessage());
            e.printStackTrace();
        }
        return dealership;
    }
}