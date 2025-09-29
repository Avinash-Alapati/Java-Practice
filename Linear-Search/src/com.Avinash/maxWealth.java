public class maxWealth{
    public static void main(String[] args) {

    }
    public int maximumWealthw(int[][] accounts){
        // person - row
        // account - col
        int maxWealth = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if ( sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}