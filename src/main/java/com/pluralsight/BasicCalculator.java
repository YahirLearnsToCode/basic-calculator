package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //Exercise 4
        Scanner myScanner = new Scanner(System.in);

        // Taking in Numbers
        System.out.print("Enter the first number: ");
        int firstNum = Integer.parseInt(myScanner.nextLine());
        System.out.print("Enter the second number: ");
        int secondNum = Integer.parseInt(myScanner.nextLine());

        // Print out Menu
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Selecting option
        System.out.print("Enter the second number: ");
        char choice = myScanner.nextLine().charAt(0);

        //Multiplying
        int total = firstNum * secondNum;

        //Printing out total
        System.out.println(firstNum + " * " + secondNum + " = " + total);
    }
}
