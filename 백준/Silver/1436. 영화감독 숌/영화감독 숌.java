
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 666;
        int cnt = 0;
        int count = 0;

        while (cnt < n) {
            if (String.valueOf(count).contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                break;
            }
            count++;

        }
        System.out.println(count);
    }
}
