package org.example;

public class Motorcycle extends Vehicle{
    String type;

    void printSpecifications(){
        super.printSpecifications();
        System.out.println("Type: " + this.type);
    }
}
