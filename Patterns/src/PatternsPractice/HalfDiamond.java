package PatternsPractice;

public class HalfDiamond {
    public static void main(String[] args) {
        halfDiamond(6);
    }

    public static void halfDiamond(int num) {
        int len = 2 * num;
        for (int i = 0; i < len - 1; i++){
            int stars = i;
            if (i > num) stars = 2 * num - i;

            for (int j = 1; j < stars; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
