import java.util.*;

// input format
// 1 - number of queries (5);
// 2 - enter each query (c);
public class CharHashing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = "abcdabejc";

        // precompute
        int[] hashArr = new int[26];
        for (int i = 0; i < str.length(); i++){
            hashArr[str.charAt(i) - 'a']++;
        }

        // taking qureies as input;
        int queries = scn.nextInt();
        while (queries > 0) {
            char query = scn.next().charAt(0);
            // fetch
            System.out.println(hashArr[query - 'a']);
            queries--;
        }

    }
}
