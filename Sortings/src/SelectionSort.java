import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        // iterate to n-2 coz we no need to check last elem
        for (int i = 0; i <= n-2; i++) {
            int min = i; // initial min is elem itselfz
            for (int j = i; j <= n-1; j++){
                if (arr[j] < arr[min]){
                    min = j; // if the current elem is less than the min, update it with j
                }
            }
            // Swap the curr elem and min elem
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // TO print the sorted elements
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}