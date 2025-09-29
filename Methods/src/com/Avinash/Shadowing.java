package com.Avinash;

public class Shadowing {
    static int x = 90; // This will get shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x); // 90
        fun();  // # Shadowing in JAVA is basically a practice of using two variables with the same name within the Scope that Overlaps
        int x;
//        System.out.println(x); - Scope will begin when value is initiated
        x = 55; // got new intialization so now on it takes this ref variable
        System.out.println(x); // 55
    }

    static void fun(){
        System.out.println(x);  // The recent intialization is only for Method block so it takes the x value at line 4

    }
}
