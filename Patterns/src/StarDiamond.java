//     *
//    * * *
//   * * * * *
//  * * * * * * *
// * * * * * * * * *
// * * * * * * * * *
//  * * * * * * *
//   * * * * *
//    * * *
//      *

public class StarDiamond {
    public static void main(String[] args) {
        int rows = 5;
        upperPyramid(rows);
        lowerPyramid(rows);
    }

    static void upperPyramid(int rows){
        for (int i = 0; i < rows; i++){
            // Leading Space
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            // Trailing Space
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void lowerPyramid(int rows) {
        for (int i = 0; i < rows; i++){
            // Leading Space
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2*rows - (2 * i + 1); j++){
                System.out.print("*");
            }
            // Trailing Space
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
