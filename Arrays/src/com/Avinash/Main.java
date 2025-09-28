package com.Avinash;

public class Main{
    public static void main(String[] args) {
        // Q : Store a Roll No
        int a = 26;

        // Q : Store Person's Name
        String name = "Avinash";

        // # Syntax
        // datatype[] variable_name = new datatype[size];

        String[] arr = new String[6];
        // or directly like this
        // Q : Store 5 Roll No's
        int[] roll = {26,2,54,6,7,4,2,2,3};

        // Example

        int[] ros; // decleration of array. ros is getting defined in the stack
        ros = new int[7]; // Initialisation - Actually here object is being created in the memory (heap)

        System.out.println(ros[0]);
        System.out.println(arr[2]);

        String user = null;
    }
}