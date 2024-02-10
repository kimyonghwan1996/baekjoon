
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] ar = new int[n];
    int max = 0;
    int sum = 0;
    for(int i = 0; i < n; i++){
        ar[i] = sc.nextInt();
    }
    Arrays.sort(ar); // 배열을 오름차순으로 정렬
    for(int i = 0; i<n-2; i ++){
        for(int j=i+1; j<n-1;j++){
            for(int k = j+1; k < n; k++){
                sum = ar[i] + ar[j] + ar[k];
                 if (max < sum && sum <=m) {
                    max = sum;
                }
                 else if (ar[i] == ar[j] || ar[i] == ar[k] || ar[j] == ar[k]) {
                  break;  
                 }
                
            }
        }
    }
    System.out.println(max);
}
}
