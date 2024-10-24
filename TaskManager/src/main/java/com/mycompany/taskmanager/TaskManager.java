/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

/**
 *
 * @author David Farmer
 */

public class TaskManager {
    private Task[] tasks = new Task[10];
    private int taskCount = 0;
public void addTask(Task task){
    if (taskCount < tasks.length){
        tasks[taskCount] = task;
        taskCount++;
    }
    else {
        System.out.println("Task list is fulll. Cannot add more tasks.");
    }
}
public void displayAllTasks(){
    for (int i= 0, i<taskCount; i++){
    System.out.println("Tasks: " + Task[]);
    
}
    else
    {
            System.out.println("There are not Tasks in this list.");
            }
}
}
