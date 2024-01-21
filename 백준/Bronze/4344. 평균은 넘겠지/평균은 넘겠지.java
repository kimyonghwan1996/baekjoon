
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int n2 = sc.nextInt();
            int[] ar = new int[n2];
            int sum = 0;
            double avg = 0;
            int cnt = 0;
            for(int j = 0; j < n2; j++){
                ar[j] = sc.nextInt();
                sum += ar[j];
                avg = (double)sum/n2;
            } 
            for(int j = 0; j < n2; j++){
                if(ar[j] > avg) cnt ++;
                
            }
            System.out.println(String.format("%.3f",((double)cnt/n2)*100) + "%");
            //System.out.println(avg);
            //System.out.println(cnt);
        }
    }
}
