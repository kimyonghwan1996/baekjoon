

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];

        for(int i = 0; i < n; i++){
            ar[i] = Integer.parseInt(br.readLine());
        }

        int max = ar[0];

        for(int i = 1; i < n; i ++){
            if (ar[i] > max) max = ar[i];
        }

        fSort(ar,n,max);
        for(int data : ar){
            sb.append(data).append('\n');
        }
        System.out.println(sb);
        /*
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int data : list){
            sb.append(data).append('\n');
        }
        System.out.println(sb);   */ 
    }

    static void fSort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];
      
        for(int i = 0; i < n; i++) f[a[i]]++;             // 1단계: 도수분포표 만들기
        for(int i = 1; i <= max; i++) f[i] += f[i - 1];      // 2단게: 누적도수분포표 만들기
        for(int i = n - 1; i >= 0; i--) b[--f[a[i]]] = a[i];   // 3단게: 목적 배열 만들기
        for(int i = 0; i < n; i++) a[i] = b[i];           // 4단계: 배열 복사하기
      }
}
