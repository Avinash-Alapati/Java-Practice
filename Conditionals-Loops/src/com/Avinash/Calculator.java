package com.Avinash;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ans = 0;
        // Take input from user till the user doenst press X or x

        while(true){
            // Take Operator as input
            System.out.println("Enter The Operator: ");
            char op = scn.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter Num-1: ");
                int num1 = scn.nextInt();
                System.out.println("Enter Num-2: ");
                int num2 = scn.nextInt();
                System.out.println();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Loop Ended");
                break;
            } else {
                System.out.println("Invalid Operation !!");
            }
            System.out.println(ans);
        }

    }
}
