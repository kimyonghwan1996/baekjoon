
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] digits = new Integer[String.valueOf(n).length()];

        // 각 자리수 추출
        for (int i = 0; n > 0; i++) {
            digits[i] = n % 10;
            n /= 10;
        }

        // 내림차순 정렬
        Arrays.sort(digits, Collections.reverseOrder());

        // 정렬된 자리수로 수 만들기
        StringBuilder sortedNumber = new StringBuilder();
        for (int digit : digits) {
            sortedNumber.append(digit);
        }

        System.out.println(sortedNumber.toString());
    }

}
