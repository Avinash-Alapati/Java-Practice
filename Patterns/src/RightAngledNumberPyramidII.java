// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

public class RightAngledNumberPyramidII {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
