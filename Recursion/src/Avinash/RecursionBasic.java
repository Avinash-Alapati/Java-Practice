package Avinash;

public class RecursionBasic {
    public static void recFun(int count){
        if (count == 6){
            return;
        }
        System.out.println(count);
        count++;
        recFun(count);
    }

    public static void revRecFun(int current){
        if (current < 1){
            return;
        }
        System.out.println(current);
        revRecFun(current - 1);
    }

    public static int sumTillN(int count){
        if (count < 1) {
            return 1;
        }
        return count + sumTillN(count-1);

    }

    public static void main(String[] args) {
//        recFun(1);
//        revRecFun(10);
        System.out.println(sumTillN(10));
    }
}
