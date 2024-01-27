import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] ar = new int[N];
        int cnt = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            if (isPrime(ar[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    // 소수를 판별하는 함수
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
