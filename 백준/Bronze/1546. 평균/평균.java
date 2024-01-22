

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        //int max = Arrays.stream(ar).max().getAsInt(); //가장큰수

        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        //Arrays.sort(ar);
        //int max = Arrays.stream(ar).max().getAsInt(); //가장큰수
        //System.out.println(max);
        
        for(int i = 0; i < n; i++){  
            //System.out.print(ar[i] + " ");
            //int max = ar[n-1];
            if(ar[i] > max) max = ar[i];
            sum += ar[i];
            //ar[i] = ar[i]*100/max;
            //System.out.print(ar[i] + " ");
        }

        //long average = sum / ar.length;
        System.out.println(sum*100.0/max/n);
    }
}
