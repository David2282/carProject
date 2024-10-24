/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

/**
 *
 * @author David Farmer
 */
public class Task {
    //properties of the Task class
  private String description;
  private String dueDate;
  private boolean isCompleted;
  
  //Constructor to initialize properties
  public Task(String description, String dueDate){
      this.description = description;
      this.dueDate = dueDate;
      this.isCompleted = false; //default to not completed
  }
  
  //Getter and Setter for description
  public String getDescription(){
      return description;
  }
  public void setDescription (String description) {
      this.description = description;
              
  }
  
  //Getter and Setter for dueDate
  public String getDueDate(){
      return dueDate;
  }
  public void setDueDate (String dueDate){
      this.dueDate = dueDate;
  }
  
  //Getter and Setter for isCompleted
  public boolean isCompleted (){
      return isCompleted;
  }
  
  public void markAsCompleted (){
      this.isCompleted = true;
  }
  
  //Method to display task details
  public void displayTaskDetails(){
      System.out.println("Description" + description);
      System.out.println("Due Date" + dueDate);
      System.out.println("Completed"+ (isCompleted ? "Yes" : "No"));
  }
  }

    

