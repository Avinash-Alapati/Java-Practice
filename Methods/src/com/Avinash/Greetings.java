package com.Avinash;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        String newMess = myGreet(name);
        System.out.println(newMess);
    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
    static void Hello(){
        System.out.println("Hello World!");
    }
}
