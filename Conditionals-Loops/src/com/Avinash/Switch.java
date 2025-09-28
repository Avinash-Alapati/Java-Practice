package com.Avinash;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String fruit = scn.next();
//
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("The Red Fruit");
//                break;
//            case "Banana":
//                System.out.println("The biggest fruit");
//                break;
//            default:
//                System.out.println("Ehh konsa fruit tha??");
//
//        }

        int day = scn.nextInt();

//        switch (day){
//            case 1 ->{
//                System.out.println("Monday");
//            }
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("WeekDay");
//                break;
//            case 6:
//            case 7:
//                System.out.println("WeekEnds");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
            case 6, 7 -> System.out.println("WeekEnds");
        }


    }
}
