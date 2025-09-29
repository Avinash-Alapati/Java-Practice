package com.Avinash;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        // Swapping 2 numbers

//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);


        swap(a,b);

        System.out.println(a + " " + b);

        String name = "Avinash Alapati";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Mahi Vardhan";
//        System.out.println(name);
    }
    //Swap using functions

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        // This change only be in this scope only

//        System.out.println("Swapped a - " + a);
//        System.out.println("Swapped b - " + b);
    }
}
