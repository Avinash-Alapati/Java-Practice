package com.Avinash;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner scn = new Scanner(System.in);

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // ADD Elements

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++){
                list.get(i).add(scn.nextInt());
            }
        }
        System.out.println(list);
    }
}
