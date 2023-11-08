package org.example;

class Vehicle {
    String manufacturer;
    String model;
    int releaseYear;


    void printSpecifications(){
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Release Year: " + releaseYear);
    }
}
