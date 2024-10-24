/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.birthday_wizard;
import java.util.Scanner;
//import java.time.*;
//import java.time.Year;
/**
 *
 * @author David Farmer
 */
public class Birthday_Wizard {

    public static void main(String[] args) {
        Scanner Age = new Scanner(System.in);
        System.out.println("How old are you?");
        int currentAge;
        currentAge = Age.nextInt();
        System.out.println("You are currently " + currentAge + " years old.");
        System.out.println("What is your birth year?");
        int birth;
        birth = Age.nextInt();
        System.out.println("Your birthyear is " + birth);
        System.out.println("Enter the age you want to know "
                + "and the Birth Wizard will tell you what year it will be when you are that age");
        int newAge;
        newAge = Age.nextInt();
        int currentYear = birth + currentAge;
        int previousYear = birth + newAge;
        int futureYear = birth + newAge;
        if (newAge >= currentAge) {
            System.out.println("You are currently " + currentAge + " years old in the year " + currentYear);
            if (newAge > currentAge) {
                System.out.println("You will be " + newAge + " years old in the year " + futureYear);
            }
    } else {
            System.out.println("You were " + newAge + " years old in the year " + previousYear);
        }
        System.out.println("The Birth Wizard has answered you.");
    }
}
