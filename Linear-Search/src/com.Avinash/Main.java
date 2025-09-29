package com.Avinash;
public class Main{
    public static void main(String[] args) {
    int[] searchInArr = {11 , 23 , 43 , 54 ,23 , 26};
    int target = 26;

    int ansIndex = linearSearchReturnIndex(searchInArr , target);
    int ansValue = linearSearchReturnElem(searchInArr , target);

        System.out.println(ans);
        System.out.println(ansValue);
    }
    // Search the target and return the element

    static int linearSearchReturnElem(int[] arr , int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a for-each loop

        for (int element : arr) {
            // check for element at every index if it is == target
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // Search in the Array : return the index if found
    // otherwise if item not found return -1

    static int linearSearchReturnIndex(int[] arr , int target){
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop

        for (int index = 0; index < arr.length; index++){
            // check for element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the above return statement works
        // hence the target not found
        return -1;
    }
}