package org.example;

class Vehicle {
    String manufacturer = "unknown";
    String model = "unknown";
    int releaseYear = 0;



    void printSpecifications(){
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Release Year: " + releaseYear);
    }
}
