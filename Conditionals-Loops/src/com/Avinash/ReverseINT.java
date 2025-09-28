package com.Avinash;

public class ReverseINT {
    public static void main(String[] args) {

        int x = -123;

        int ans = 0;
        while (x != 0){
            int rem = x%10;
            x /= 10;
            if(rem < Integer.MIN_VALUE){
                System.out.println(0);
            }
            ans = ans * 10 + rem;
        }
        x = ans;
        System.out.println(x);
    }

}
