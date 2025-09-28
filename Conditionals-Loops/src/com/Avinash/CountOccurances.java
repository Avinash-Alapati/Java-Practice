package com.Avinash;

import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int count = 0;
        int n = 0;
        while(input > 0){
            n = input%10;
            if (n == 3){
                count++;
            }
            input = input / 10;
        }
        System.out.println(count);
    }
}
