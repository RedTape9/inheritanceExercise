package org.example;

class Car extends Vehicle{
    int numberOfDoors;

    Car(){
        // super();
        this.manufacturer = "VW";
        this.model = "Golf";
        this.releaseYear = 2010;
        this.numberOfDoors = 4;
    }

    void getSpecifications(){
        super.getSpecifications();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
