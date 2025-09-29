// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits{
    public static void main(String[] args) {
        int[] nums = {22 , 333 , 2 , 7865};
        System.out.println(findNumber(nums));
    }

//    static int findNumber(int[] nums) {
//        int count = 0;
//
//        for (int num : nums) {
//            if (even(num)){
//                count++;
//            }
//        }
//        return count;
//    }

    // a function to check whether the num is even or not;
//    static boolean even(int n) {
//        if ( n % 2 == 0) {
//            return true;
//        }
//        return false;
//    }

    // a funtion to count digitd

    static int countDigits(int num) {
        if (num < 0) {
            num *= -1;
        }
        
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}