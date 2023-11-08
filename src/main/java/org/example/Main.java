package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printSpecifications();

        System.out.println("\n");

        Car car = new Car();
        car.manufacturer = "VW";
        car.model = "Golf";
        car.releaseYear = 2010;
        car.numberOfDoors = 4;
        car.printSpecifications();

        System.out.println("\n");

        Motorcycle chopper = new Motorcycle();
        chopper.manufacturer = "Harley Davidson";
        chopper.releaseYear = 2015;
        chopper.model = "Iron 883";
        chopper.type = "Chopper";
        chopper.printSpecifications();


    }
}