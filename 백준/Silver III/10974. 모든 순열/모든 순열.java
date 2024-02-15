
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int m = 1;
        for(int i = 1; i < n +1;i++){
            m *= i;
        }
        int[] ar = new int[n];
        for(int i = 0; i < n ; i++ ){
            ar[i] = i+1;
        }
        for(int i =0; i < n; i++){
            bw.write(ar[i] + " ");
        }
        bw.write("\n");

        while(get_next_perm(m,ar)){
            for(int num : ar){
                bw.write(String.valueOf(num) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        
    }
    private static boolean get_next_perm(int m,int[] ar){
        int i = ar.length - 1;

        // 뒤에서부터 체크하여 현재 위치가 뒤에서부터 오름차순이 아닌 경우를 찾음
        // 뒤에서부터 오름차순이라는 것은 사전 순으로 최종 수열이라는 의미임
        while(i > 0 && ar[i-1] >= ar[i]) i--;

        // 이미 자체적으로 최종 순열이라면, false를 반환
        if(i <= 0) return false;

        // j는 현재 i-1위치에서 시작.
        // i-1 이후의 모든 숫자 중 큰 것을 고르는데 그 중, j의 값이 가장 큰 경우로 선택
        int j = ar.length - 1;
        while(j > i && ar[j] <= ar[i-1]) j--;

        // j와 i-1번째의 숫자를 swap
        swap(ar,i-1, j);

        // i번째부터 이후의 모든 숫자를 뒤집음
        j = ar.length - 1;
        while(i < j){
            swap(ar,i, j);
            i+=1; j-=1;
        }
        return true;
    }

    private static void swap(int[] ar,int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}
