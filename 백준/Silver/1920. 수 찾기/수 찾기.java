
import java.util.Arrays;
import java.util.Scanner;

//백준 1920- 이진탐색
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int target = sc.nextInt();
            boolean find = false;
            int left = 0;
            int right = a.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                int mid_value = a[mid];
                if (mid_value < target) left = mid + 1;
                else if (mid_value > target) right = mid - 1;
                else {find = true; break;}
            }
            if (find) System.out.println(1);
            else System.out.println(0);
        }
    }
}
