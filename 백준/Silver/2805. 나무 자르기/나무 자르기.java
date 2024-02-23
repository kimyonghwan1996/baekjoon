
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] ar = new int[n];

        for(int i = 0; i < n; i ++){
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);
        long high = ar[n-1];
        long low = 0;
        long mid = 0;

        while (low < high) {
            long sum = 0;
            mid = (high + low) / 2;

            for(int i = 0; i < n; i++){
                if (ar[i] - mid > 0 ) {
                    sum += ar[i] - mid;
                }
            }

            if (sum < m) {
                high = mid;
            }
            
            else{
                low = mid + 1;
            }

        }
        System.out.println(low-1); 
    }
}