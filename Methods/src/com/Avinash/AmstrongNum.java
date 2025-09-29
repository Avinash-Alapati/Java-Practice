package com.Avinash;

import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        boolean ans = Amst(n);
        System.out.println(ans);

    }

    static boolean Amst(int n){
        int sum = 0;
        int org = n;
        while(n > 0){
            int rem = n%10;
            n /= 10;
            sum += rem*rem*rem;
            }
        if(sum == org){
            return true;
        }
        else {
            return false;
        }
    }
}
