// bruteforce approach (hashing)

class Main {
    static int returnCount (int n , int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2, 2, 2, 2};
        int ans =  returnCount (2 , arr);
        System.out.println(ans);
    }
}