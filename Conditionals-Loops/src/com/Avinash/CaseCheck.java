package com.Avinash;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().trim().charAt(0);

        System.out.println(ch);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
