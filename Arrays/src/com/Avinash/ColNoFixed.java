package com.Avinash;

public class ColNoFixed {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},
                {6,5,4},
                {2,6}
        };
        for(int row = 0; row < arr.length ; row++){
            for (int cols = 0; cols < arr[row].length;cols++){
                System.out.print(arr[row][cols] + " ");
            }
            System.out.println();
        }
    }
}
