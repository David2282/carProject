/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carproject;

/**
 *
 * @author David Farmer
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String fuelType;
    private float fuelAmount; //in gallons
    private Engine engine;

    //Constructor for class Car
public Car(int year, String make, String model, String color, String fuelType, float fuelAmount, Engine engine) {
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.fuelType = fuelType;
    this.fuelAmount = fuelAmount;
    this.engine = engine;
}    

//Getters for make, model, year, color, fuelType, fuelAmount
public String getMake(){
    return make;
}
public String getModel(){
    return model;
}
public int getYear(){
    return year;
}
public String getColor(){
    return color;
}
public String getFuelType(){
    return fuelType;
}
public float getFuelAmount(){
    return fuelAmount;
}

//Setters for make, model, year, color, fuelType, fuelAmount
public void setMake(String make){
    this.make = make;
}
public void setModel(String model){
    this.model = model;
}
public void setYear(int year){
    this.year = year;
}
public void setColor(String color){
    this.color = color;
}
public void setFuelType(String fuelType){
    this.fuelType = fuelType;
}
public void setFuelAmount(float fuelAmount){
    this.fuelAmount = fuelAmount;
}
public void start(){
    System.out.println("The car is idling.");
    if (engine != null){
        engine.ignite();
    }
    else {
        System.out.println("The car needs something to make it move: a parasail, a pulling or pushing force or maybe an ENGINE!!!");
    }
}
public void stop(){
    System.out.println("The car is turned off.");
}
public void refuel(float fuelAmount){
    if (fuelAmount <= 0){
        System.out.println("The car is out of fuel. Please refuel");
    }
}
}









