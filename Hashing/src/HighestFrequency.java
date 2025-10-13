// Returns the Element With Highest Frequency

import java.util.*;
import java.util.HashMap;

public class HighestFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        // Pre Compute
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int key = nums[i];
            int freq = 0;
            if (mpp.containsKey(key)) {
                freq = mpp.get(key);
            }
            freq++;
            mpp.put(key , freq);
        }

        // Finding Max
        int maxKey = 0;
        int maxVal = 0;
        for(Map.Entry<Integer,Integer> it : mpp.entrySet()){
            maxKey = Math.max(maxKey , it.getKey());
            // maxVal = Math.max(maxVal , it.getvalue());
        }

        System.out.println(maxKey);
    }
}
