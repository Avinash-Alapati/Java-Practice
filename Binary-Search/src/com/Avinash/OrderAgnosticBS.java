package com.Avinash;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90, 85, 76, 56, 26, 12, 8, 4, 3, 2, 1, 0, -1, -5, -15};
        int target = 26;
        int index = orderAgnosticBS(arr, target);
        System.out.println(index);
    }
    static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            // find middle element
            //  int middle = start + end / 2; // // might be possible that (start + end) can exceed the range of int in java
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc){
                if (target < arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
