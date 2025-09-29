package com.Avinash;

public class MethodOverLoading {
    public static void main(String[] args) {
//        System.out.println(26);
//        System.out.println("Avinash Alapati");

        int ans = sum(26 , 26);
        int ans1 = sum(26,26,26);

        System.out.println(ans);
        System.out.println(ans1);
    }

    static int sum(int a , int b){
        return a + b;
    }

    static int sum(int c , int d , int e){
        return c + d + e;
    }

//    static void fun(int num){
//        System.out.println(num);
//    }
//
//    static void fun(String name){
//        System.out.println(name);
//    }
}
