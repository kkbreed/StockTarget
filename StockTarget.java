/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktarget;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class StockTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*
        Create a new Java application called StockTarget.  Your company has shares 
        of stock it would like to sell when their value exceeds a certain target 
        price.  Write a code snippet that prompts the user to enter the target 
        price and then prompts the user for the current stock price until they 
        enter a value that is at least the target price, using a do while loop.  
        Once the user enters a value that meets or exceeds the target price, 
        the program should output that the stock price meets or exceeds the target price.
        */
         Scanner scnr = new Scanner(System.in);
            
            double current = 0;
            double target;
        
            
        do
    {
        System.out.println("Enter the target price of the stock: ");
        target = scnr.nextDouble();
        
        
        System.out.println("Enter the current price of the stock: ");
        current = scnr.nextDouble();
        
       // if (target != current) break;
         }
   while((target <= current) && target != current); 
    
        System.out.println("The value meets or exceeds the target price.");
    }
        
    }
    

