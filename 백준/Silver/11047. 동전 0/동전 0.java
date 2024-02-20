
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 동전의 종류 수
        int K = scanner.nextInt(); // 만들어야 하는 금액
        int[] coins = new int[N];
        
        // 동전 가치 입력 받기
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }
        
        // 최소 동전 개수 계산
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (K >= coins[i]) {
                count += K / coins[i];
                K %= coins[i];
            }
        }
        
        System.out.println(count);
    }
}
