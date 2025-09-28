package com.Avinash;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int[3][]; // no need to specify cols

//        int[][] arr = {
//                {1,2,3}, // 0th Index
//                {4,5}, // 1st Index
//                {7,8,9,2} // 2nd Index
//        };


        int[][] arr = new int[3][3];
        System.out.println(arr.length); // This will only give num of rows even if they are cols

        // Input for an 2D array

        for (int row = 0; row < arr.length ; row++){
            //for every col in every row
            for (int col = 0; col < arr[row].length ; col++){
                arr[row][col] = scn.nextInt();
            }
        }


        // Output of an 2D Array
        // Method - 1

//        for(int row = 0 ; row < arr.length ; row++){
//            for (int col = 0; col < arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


        // Method - 2
//        for(int row = 0; row < arr.length ; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }


        // Method - 3 - Enhanced for loop
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }

    }
}


