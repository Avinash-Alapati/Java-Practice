public class findMin {
    public static void main(String[] args) {
        int[] searchInArr = {11 , 23 , 43 , 54 ,23 , 26};
        int result = minNum(searchInArr);
        System.out.println(result);
    }

    // Lets assume arr.length != 0;
    // return the Min number in array
    static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}