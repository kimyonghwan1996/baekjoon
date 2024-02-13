import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i ++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));

        for(int i = 0; i < n-1; i ++){
            if (arr[i][0] == arr[i+1][0]) {
                int start = i;
                while (i < n-1 && arr[i][0] == arr[i+1][0]) {
                    i++;
                }
                Arrays.sort(arr, start, i+1,Comparator.comparingInt((int[] o) -> o[1])); 
            } 
        }

        for(int[] row : arr){
            System.out.println(row[0] + " " + row[1]);
        }
    }
}