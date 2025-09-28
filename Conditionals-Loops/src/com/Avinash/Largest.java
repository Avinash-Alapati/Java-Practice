package com.Avinash;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // Q-1 : Find The Largest of Three
        // Method - 1

//        int max = 0;

//        if (a>b && a>c){
//            System.out.println("A is Greater: " + a);
//        } else if (b>c) {
//            System.out.println("B is Greater: " + b);
//        }
//        else {
//            System.out.println("C is greater: " + c);
//        }

        // Method - 2
//        int max = a;
//
//        if (b>max) {
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }


        // Method - 3

//        int max = 0;
//
//        if (a>b){
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c>max){
//            max = c;
//        }


        // Method - 4

        int max = Math.max(a,b);
        int result = Math.max(c,max);
        System.out.println(result);

    }
}
