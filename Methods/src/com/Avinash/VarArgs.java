package com.Avinash;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // Variable length arguments
        fun("Avinash Alapati" , "Yadagini Mahi Vardhan" , "Bommanaboina Ashok", "Jalluri Venkata Sri Sai");
        multiple(24,32,"Avinash Alapati");
    }

    static void multiple(int a , int b , String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));

    }
}
