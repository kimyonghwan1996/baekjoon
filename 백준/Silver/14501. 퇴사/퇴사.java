import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 입력 받기
        int N = scanner.nextInt();

        // 상담 일정 배열 생성
        int[][] schedules = new int[N][2]; // 0: Ti, 1: Pi

        // 상담 일정 입력 받기
        for (int i = 0; i < N; i++) {
            schedules[i][0] = scanner.nextInt(); // Ti 입력
            schedules[i][1] = scanner.nextInt(); // Pi 입력
        }

        // 최대 이익 계산
        int maxProfit = calculateMaxProfit(N, schedules);

        // 결과 출력
        System.out.println(maxProfit);

        scanner.close();
    }

    public static int calculateMaxProfit(int N, int[][] schedules) {
        int[] dp = new int[N + 1]; // dp 배열 초기화

        for (int i = 1; i <= N; i++) {
            int maxProfit = 0;
            // i일까지의 최대 수익 계산
            for (int j = 1; j <= i; j++) {
                // 상담이 퇴사 전에 끝나는 경우
                if (j + schedules[j - 1][0] - 1 <= i) {
                    maxProfit = Math.max(maxProfit, dp[j - 1] + schedules[j - 1][1]);
                }
            }
            dp[i] = maxProfit;
        }

        // 마지막 날까지의 최대 이익 반환
        return dp[N];
    }
}
