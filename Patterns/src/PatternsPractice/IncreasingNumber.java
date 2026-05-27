package PatternsPractice;

public class IncreasingNumber {
    public static void main(String[] args) {
//        increaseNumberPattern(6);
//        increasingLetters(5);
        invertedIncreasingLetters(5);
    }

    public static void increaseNumberPattern(int n){
        int c = 1;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(c + " ");
                c += 1;
            }
            System.out.println(" ");
        }
    }

    public static void increasingLetters(int n) {
        for (int i = 0; i <= n; i++){
            for (char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    public static void invertedIncreasingLetters(int n) {
        for (int i = 0; i <= n; i++){
            for (char ch = 'A'; ch < 'A' + (n - i - 1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }
}
