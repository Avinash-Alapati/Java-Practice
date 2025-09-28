package com.Avinash;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(3);

        Scanner scn = new Scanner(System.in);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);


//        System.out.println(list.contains(26));
//        System.out.println(list);
//        list.set(0,26); // update values ( index , integer Value)
//        list.remove(2);
//        System.out.println(list);

        for (int inp = 0 ; inp < 3 ; inp++){
            list.add(scn.nextInt());
        }

        for (int inp = 0 ; inp < 3 ; inp++){
            System.out.println(list.get(inp)); // you cant directly pass arr[0] like this
            // pass index here , list[index] will not work here
        }


//        System.out.println(list);
    }
}
