/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("##.##");
        Scanner uInput = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double OrderAmount = uInput.nextDouble();
        uInput.nextLine();
        double Tax = .055 * OrderAmount;
        System.out.println("What is the state?");
        String State = uInput.nextLine();
        System.out.println("The subtotal is $" + DF.format(OrderAmount));
        if (State.equals("WI")) {
            System.out.println("The tax is: $" + Tax + "\nThe total is: $" + DF.format(OrderAmount + Tax));
        }
    }
}
