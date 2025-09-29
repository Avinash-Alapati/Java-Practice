public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] newArr = {
                {23,4,1},
                {18,26,3,7},
                {78,39,84},
                {18,12}
        };
        int target = 26;
        int[] ans = search(newArr , target); // format of return value - { row , col }
        System.out.println(Arrays.toString(ans));
        System.out.println(max(newArr));
    }

    // Searching in 2d array
    static int[] search(int[][] arr , int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row , col};
                }
            }
        }
        return new int[] {-1 , -1};
    }

    // Finding max in 2d Array

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}