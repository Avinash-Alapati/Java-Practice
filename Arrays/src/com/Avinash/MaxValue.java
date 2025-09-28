package com.Avinash;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {26,12,43,64,1232,86};

        System.out.println(max(arr));
        System.out.println(maxRange(arr , 1 , 3));
    }
    static int max(int[] ex){

        if(ex.length == 0){
            return -1;
        }
        int max = 0;

        for (int i = 0; i < ex.length; i++) {
            if(ex[i] >= max){
                max = ex[i];
            }
        }
        return max;
    }

    // Max Value from a particular range index

    static int maxRange(int[] arr , int start , int end){
        // work on edge cases here like error being null or whatever
        if ( end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];

        for (int i = start; i <= end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
