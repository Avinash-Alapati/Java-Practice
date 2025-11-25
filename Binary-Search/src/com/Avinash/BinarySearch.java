package com.Avinash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 15, 19, 23, 26, 35, 45, 55};
//        int[] array = {90, 85, 76, 56, 24, 12};
        int target = 26;
        int index = ascBinarySearch(array , target);
        boolean checkSort = descendingSorted(array);
        if (checkSort) {
            System.out.println("Descending order");
        } else {
            System.out.println("Ascending order");
        }
        System.out.println(index);
    }

    // return the index where the element found
    // return -1 if elem not found

    static int ascBinarySearch(int[] arr , int target){
         int start = 0;
         int end = arr.length - 1;

         while (start <= end){
             // find middle element
           //  int middle = start + end / 2; // // might be possible that (start + end) can exceed the range of int in java
             int middle = start + (end - start) / 2;

             if (target < arr[middle]){
                 end = middle - 1;
             } else if (target > arr[middle]) {
                 start = middle + 1;
             }
             else {
                 return middle;
             }
         }
        return -1;
    }

    static int desBinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;

            if (target < arr[middle]){
                start = middle + 1;
            } else if (target > arr[middle]){
                end = middle - 1;
            } else {
                return middle; // returns the index if element found
            }
        }
        return -1;
    }

    static boolean descendingSorted(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        return first > last;
    }
}