import java.util.*;

// input format
// 1 - number of queries (2);
// 2 - enter each query (4);

public class HashArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5;
        int[] arr = {1, 3, 2, 1, 3};

        // precompute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        int queries = scn.nextInt();
        while(queries > 0) {
            int number = scn.nextInt();
            //  fetch
            System.out.println(hash[number]);
            queries--;
        }

    }
}
