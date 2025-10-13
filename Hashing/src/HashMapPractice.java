// input format

// Size of the array - n
// Elements in array - 1 2 3 4 5
// no of Queries - 3
// Enter Each Query - 2...

import java.util.*;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input array Size
        int n;
        System.out.println("Enter The Size of Array: ");
        n = scn.nextInt();

        // Initialisation of Array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){ // Take Input for each element
//            System.out.println("Enter Array values: ");
            arr[i] = scn.nextInt();
        }

        // Precompute

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if(mpp.containsKey(key)){
                freq = mpp.get(key); // fetching from map
            }
            freq++;
            mpp.put(key , freq);
        }

        // Iterate over the map:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        // Queries
        System.out.println("Enter Number of Queries: ");
        int queries = scn.nextInt();
        while (queries > 0){
            System.out.println("Enter Your Query: ");
            int query = scn.nextInt();
            // Fetch
            if (mpp.containsKey(query)) {
                System.out.println(mpp.get(query));
            } else {
                System.out.println(0);
            }
            queries--;
        }
    }
}
