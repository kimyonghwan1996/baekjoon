
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = 0; i < n; i ++){
                pq.add(Integer.parseInt(br.readLine()));
            }
            int cnt = 0;
    
            while (pq.size() > 1) {
                int sum1 = pq.poll();
                int sum2 = pq.poll();
                cnt += sum1 + sum2;
                pq.add((sum1 + sum2));
            }
            System.out.println(cnt);
        }
    
}
