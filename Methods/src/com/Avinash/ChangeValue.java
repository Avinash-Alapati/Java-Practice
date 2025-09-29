package com.Avinash;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an Array

        int[] arr = {2,2,564,6,4,84,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 0; // If you make change to the object via ref variable , same obj will be changed

    }
}
