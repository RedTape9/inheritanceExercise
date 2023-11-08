package org.example;

class Car extends Vehicle{
    int numberOfDoors;

    Car(){
        // super();
        // default values
        this.manufacturer = "VW";
        this.model = "Golf";
        this.releaseYear = 2010;
        this.numberOfDoors = 4;
    }

    void printSpecifications(){
        super.printSpecifications();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
