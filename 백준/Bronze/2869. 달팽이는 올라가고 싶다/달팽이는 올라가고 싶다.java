import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int C = A - B;

        int days = (V - B - 1) / C + 1;
        System.out.println(days);
    }
}
