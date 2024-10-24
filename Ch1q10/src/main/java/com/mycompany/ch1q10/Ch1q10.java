/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ch1q10;
import java.util.Scanner;
/**Write statements used in a java program to read two integers and display 
 * the number of integers that lie between them, including the integers 
 * themselves. For example, four integers are between 3 and 6: 3,4,5, and 6.
 * @author David Farmer
 */
public class Ch1q10 {

    public static void main(String[] args) {
       System.out.println("Enter the starting whole number");
        Scanner startingNumber = new Scanner(System.in);
        int n1; //printed startingNumber
        n1 = startingNumber.nextInt();
        System.out.println("The Starting number is " + n1);
        System.out.println("Enter the ending whole number");
        Scanner endingNumber = new Scanner(System.in);
        int n2; //printed endingNumber
        n2 = endingNumber.nextInt();
        System.out.println("The Ending number is " + n2);
        int count; //printed count of integers between n1 & n2 
        count = 0;
        if (n1 > n2) {
            System.out.println("Starting number is larger than the ending number, decrementing to lesser value");
            while(n1-count>=n2){
               count++; 
               System.out.println("Current loop iteration: "+(n1-count));
                
            }
            System.out.println("There are "+count+" integers between "+n1+" and "+n2);
                } 
        
        else {
            System.out.println("Starting number is smaller that the ending number, incrementing to larger value");
            while(n1+count<=n2){
                System.out.println("Current loop iteration: "+(n1+count));
                count++;
                    }
            System.out.println("There are "+count+" integers between "+n1+" and "+n2);
                }
         }
        }

        
    
     
              
   
        
       
    
        
    
