package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); 
        int a, b;
        
        System.out.print("Enter a value of a = ");
        a = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter a value of b = ");
        b = scanner.nextInt();

        System.out.println("Result of addition: " + (a + b));
        System.out.println("Result of subtraction " + (a - b));
        System.out.println("Result of multiplication " + (a * b));
        System.out.println("Result of division: " + ((float)a / (float)b));
        System.out.println("The rest from the division: " + (a % b));
    
    }
 }
