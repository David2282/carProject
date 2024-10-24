/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carproject;

/**
 *
 * @author David Farmer
 */
//I own
public class Wheel {
    private int tirePressure; //in psi
    private int diameter; //size of the wheel in inches
    private int condition; //wear percentage between 0-100
    
    //Constructor for Wheel
public Wheel (int tirePressure, int diameter, int condition){
    this.condition = condition;
    this.diameter = diameter;
    this.tirePressure = tirePressure;
}
    
//Getter for tirePressure
public int getTirePressure (){
    return tirePressure;
}

//Getter for diameter
public int getDiameter(){
    return diameter;
}

//Setter for diameter
public void setDiameter (int diameter){
    this.diameter = diameter;
}

//refill tirePressure
public void refillTirePressure (int tirePressure){
    if (this.tirePressure <= 50)
        tirePressure = 50;
    System.out.println("The tire pressure is excellent");
}

//check tirePressure
public void checkTirePressure (int tirePressure){
    int[] thresholds = {50, 45, 35, 25, 0};
    
    String[] responses = {
        "The tire pressure is excellent",
        "The tire pressure is great",
        "The tire pressure is good",
        "The tire pressure is poor, consider refilling the tire with air.",
        "The Tire is flat. Refill tire pressure or replace the Wheel to avoid further damage to the Car!"
    };
    for (int i = 0; i < thresholds.length; i++){
        if (tirePressure >= thresholds[i]){
            System.out.println(responses[i]);
            break;
        }
    }
}
    
public void replace(){
    if (this.condition <= 25){
        System.out.println("The condition of the Wheel is less than 25% and needs to be replaced");
        this.condition = 100;
        System.out.println("The condition of the Wheel is 100%");
    }
    else {
        System.out.println("The condition of the Wheel is over 50%; the Wheel is in good condition");
    }
}
public void conditionOfWheel (int condition){
    int[] thresholds = {100, 75, 50, 25, 0};
    
    String[] responses = {
        "The Wheel is in excellent condition.",
        "The Wheel is in great condition.",
        "The Wheel is in good condition.",
        "The Wheel is in poor condition. Consider replacing",
        "The Wheel has had a blowout! Replace immediately to avoid further damage to the Car!"
    };
    for (int i = 0; i < thresholds.length; i++){
        if (condition >= thresholds[i]){
            System.out.println(responses[i]);
            break;
        }
    }
    
}
}


