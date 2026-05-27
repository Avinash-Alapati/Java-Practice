package PatternsPractice;

public class AlphaTriangle {
    public static void main(String[] args) {
        alphaTriangle(5);
    }

    public static void alphaTriangle(int n){
        for (int i = 0; i < n; i++){
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
