package PatternsPractice;

public class InveredRightAngleTriangle {
    public static void main(String[] args) {
        invertedTraingle(5);
        invertedNum(5);
    }

    public static void invertedTraingle(int n) {
        for (int i =0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void invertedNum(int n) {
        for (int i =0; i < n; i++){
            for (int j = 1; j < n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
