/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carproject;

/**
 *
 * @author David Farmer
 */
public class Engine {
    private float spark; //in volts
    private float air;  //in psi
    private float fuel; //in gallons
    private boolean isIgnited = false;
public Engine (float spark, float air, float fuel){
    this.spark = spark;
    this.air = air;
    this.fuel = fuel;
}

//Getters for spark, air, fuel
public float getSpark(){
    return spark;
}
public float getAir(){
    return air;
}
public float getFuel(){
    return fuel;
}

//Setter for spark, air , fuel
public void setSpark(float spark){
    if (spark < 0){
        System.out.println("Spark cannot be negative. Setting spark to 0.");
        this.spark = 0;
    }
    else
    {
    this.spark = spark;
}
}
public void setAir(float air){
    if (air < 0){
        System.out.println("Air cannot be negative. Setting air to 0.");
    this.air = 0;
    }
    else
    {
        this.air = air;
    }
}
public void setFuel(float fuel){
    if (fuel < 0){
        System.out.println("Fuel cannot be negative. Setting fuel to 0.");
        this.fuel = 0;
    } 
    else
    {
    this.fuel = fuel;
}
}
public void ignite(){
    if (spark > 0 && air >0 && fuel >0){
        isIgnited = true;
        System.out.println("We have ignition!");
    }
    else
    {
        System.out.println("The mixture is off because spark = " + spark + ", air = " + air + ", fuel = " + fuel);
    }
}
public void idle(){
    if (isIgnited){
        System.out.println("The engine is idling");
    }
    else
    {
        System.out.println("The engine must be ignited first to idle");
    }
}
public void rev(){
    if (isIgnited){
        System.out.println("The engine rev's up! Vroom!");
        this.fuel -= 0.1f;
    }
    else
    {
        System.out.println("The engine must be ignited first to rev");
    }
}
}
