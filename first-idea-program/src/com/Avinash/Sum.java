package com.Avinash;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        float Sum = num1 + num2;

        System.out.println("Sum of 2 nums : " + Sum);
    }
}
