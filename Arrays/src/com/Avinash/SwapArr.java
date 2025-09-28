package com.Avinash;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,26};
//        swap(arr , 1 , 3);

        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Reverse the Arr using the swap method
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr , start , end);
            start++;
            end--;
        }

    }

    //Swap elements in particular indices
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
