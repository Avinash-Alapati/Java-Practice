package com.Avinash;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Q: Take Input of two numbers and print the SUM
//        Scanner scn = new Scanner(System.in);
//
//        System.out.print("Enter the Num-1: ");
//        int num1 = scn.nextInt();
//
//        System.out.print("Enter Num-2: ");
//        int num2 = scn.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum of Two Numbers: " + sum);




        /*

            Access Modifier return_type name(Arguments) {
                #Body
                return statement;
            }

        */

        sum();

//       int ans =
//        System.out.println(ans);
    }

    static int sum2(int num1 , int num2){

        int sum = num1 + num2;
        return sum; // Katamm

//        System.out.println("This will never gets executed");
    }

    static void sum(){
        int num1 = 25;
        int num2 = 24;
        int sum = num1 + num2;

        System.out.println("Sum of Two Numbers: " + sum);
    }
}
