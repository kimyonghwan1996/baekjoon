import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 가능한 최대 y값을 찾기
        int max_y = N / 5;
        int min_bags = Integer.MAX_VALUE;

        // x값을 0부터 max_y까지 반복하면서 가능한 경우를 탐색
        for (int y = 0; y <= max_y; y++) {
            // 3킬로그램 봉지의 개수 계산
            int x = (N - 5 * y) / 3;

            // 만약 x와 y가 음수가 아니고, 봉지의 개수가 최소값보다 작다면 최소값 업데이트
            if (x >= 0 && (x + y) < min_bags && (x * 3 + y * 5) == N) {
                min_bags = x + y;
            }
        }

        // 만약 min_bags가 초기값 그대로라면 봉지로 정확하게 N킬로그램을 만들 수 없는 경우
        if (min_bags == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min_bags);
        }
    }
}