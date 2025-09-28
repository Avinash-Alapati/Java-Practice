package com.Avinash;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int Salary = scn.nextInt();

//       if (Salary<10000){
//           System.out.println("You got an Increment of 2k");
//           Salary += 2000;
//           System.out.println("Your Updated Salary :" + Salary);
//       }
//       else{
//           System.out.println("Your got an increment of 1k");
//           Salary += 1000;
//           System.out.println("Your Updated Salary:" + Salary);
//       }

        if (Salary > 10000 && Salary < 20000){
            Salary += 2000;
        }
        else if (Salary > 25000) {
            Salary -= 2500;
        }
        else{
            Salary += 6000;
        }
        System.out.println(Salary);
    }
}