package com.Avinash;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 26;
//        arr[1] = 12;
//        arr[2] = 36;
//        arr[3] = 153;
//        arr[4] = 34;

//        System.out.println(arr[3]);

        // Input using For Loop Loops

//        for (int i = 0; i < arr.length; i++){
//        arr[i] = scn.nextInt();
//        }

        // # To Print ELems in Array
//        System.out.println(Arrays.toString(arr)); // Method - 1 to print elem in arr

//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);   // Method 2
//        }

        for( int num : arr){ // for every element in the array , print the element
            System.out.print(num); // Here num represent the element of the array
//             Method - 3
        }

//        System.out.println(arr[5]); // Index out of bound Error


        //Array of objects

//        String[] names = new String[5];
//
//        for (int i = 0 ; i < names.length ; i++){
//            names[i] = scn.next();
//        }
//
//        System.out.println(Arrays.toString(names));

        // Modify

//        names[1] = "bb";
//        System.out.println(Arrays.toString(names));

    }
}
