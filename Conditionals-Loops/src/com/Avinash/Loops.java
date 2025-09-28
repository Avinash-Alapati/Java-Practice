package com.Avinash;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Print Number from 1-5

        /* For Loop Syntax
            for(Initialization;Condition;Increment/Decrement) {
                #Body
            }
         */

//        for (int i = 0; i <= 5; i++){
//            System.out.println(i);
//        }



//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
//        for(int i = 0; i<= num ; i++ ){
//            System.out.println(i);
//        }

        // While Loop

        /*
        Syntaxx
        while (condition){
        body (Statement)
        Increment/decrement
        }
         */

        // While Loop for 1-5 numbers.

//        int num = scn.nextInt();
//        int count = 0;
//        while(count < num){
//            System.out.println(count);
//            count++;
//        }
//        System.out.println("Your Loop has runned : " + count + "Times");


            // DO While Loop

        /*
                Syntax
                do{

                } while(Condition);
         */

        int n = 0;
        do{
            System.out.println(n);
            n++;
        } while(n <= 5);



    }
}
