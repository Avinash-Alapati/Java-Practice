// Search in Particular Range of an array

public class searchInRange{
    public static void main(String[] args) {
        int[] newArr = {11 , 23 , 43 , 54 ,23 , 26 , 43 , 43 ,65};
        int target = 26;
        int result = linearSearch(newArr , target , 1 , 4)
        System.out.println();
    }

    static int linearSearch(int[] arr , int target ,int start , int end){
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop

        for (int index = start; index <= end; index++){
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