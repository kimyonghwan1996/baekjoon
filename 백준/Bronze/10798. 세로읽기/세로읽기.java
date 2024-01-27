import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] words = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                words[i][j] = word.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (words[i][j] != '\0') {
                    System.out.print(words[i][j]);
                }
            }
        }
        sc.close();
    }
}