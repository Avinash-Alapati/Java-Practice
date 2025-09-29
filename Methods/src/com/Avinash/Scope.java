package com.Avinash;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Avinash Alapati";
//        System.out.println(num);  - Method Scope - Can only be accessed in the same method

        {
//            int a = 25;  # Already initialized outside the block in same method , hence you cannot initialize again
            a = 26; // You can change the origin ref variable to new value again
            System.out.println(a);
            int num = 25;
            name = "Mahi Vardhan";
            System.out.println(name);
            // Values Initialized in this block will remian in this block
        }
        int num =324;
//        System.out.println(num);  # Cant access outisde the block
        System.out.println(a); // Changed outside the block as well


        // Scoping in for loop

        for (int i = 0; i < 4; i++){
            System.out.println(i);
        }

    }

    static void Scope(){
        int num = 69;
        System.out.println(num);
    }
}
