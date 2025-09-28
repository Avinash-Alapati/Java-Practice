package com.Avinash;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int empID = scn.nextInt();
        String department = scn.next();

        switch(empID){
            case 1:
                System.out.println("Avinash Alapati");
                break;
            case 2:
                System.out.println("Bommanaboina Ashok");
                break;
            case 3:
                System.out.println("Yadagini Mahi Vardhan");
                break;
            case 4:
                System.out.println("Jalluri Venkata Sri Sai");
                break;
            case 5:
                System.out.println("EmpNo-5");
                switch (department){
                    case "CAI":
                        System.out.println("Artificial Intelligence");
                        break;
                    case "CSM":
                        System.out.println("Machine Learning");
                        break;
                    default:
                        System.out.println("No Department added");
                        break;
                }
                break;
            default:
                System.out.println("EmpID Incorrect");
        }



    }
}
