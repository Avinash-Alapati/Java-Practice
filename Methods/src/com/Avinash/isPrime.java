package com.Avinash;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = primeCheck(n);
        System.out.println(ans);
    }
    static boolean primeCheck(int n){
        int c = 2;
        while(c < n){
            if (n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}

