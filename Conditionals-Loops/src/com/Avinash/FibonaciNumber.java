package com.Avinash;

import java.util.Scanner;

public class FibonaciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nth = scn.nextInt();
        int previous = 0;
        int current = 1;
        int count = 2;

        while(count <= nth){
            int temp = current;
            current += previous;
            previous = temp;
            count++;
        }
        System.out.println(current);
    }
}
