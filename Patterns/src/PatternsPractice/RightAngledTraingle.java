package PatternsPractice;

public class RightAngledTraingle {
    public static void main(String[] args) {
        int n = 5;

        rightAngledTraingleNum(6);
        rightAngleTriangle(6);
        printPatternNum2(6);
    }

    public static void rightAngledTraingleNum(int n) {

        for (int i = 1; i < n; i++){
            for (int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void printPatternNum2(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void rightAngleTriangle(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
