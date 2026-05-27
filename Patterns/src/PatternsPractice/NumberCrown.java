package PatternsPractice;

public class NumberCrown {
    public static void main(String[] args) {
        numberCrown(8);
    }

    public static void numberCrown(int n) {
        int space = 2 * (n - 1);
        for (int i = 0; i < n; i++){
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Space
            for (int j = 0; j < space;j++){
                System.out.print(" ");
            }

            //numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
            space -= 2;
        }
    }
}
