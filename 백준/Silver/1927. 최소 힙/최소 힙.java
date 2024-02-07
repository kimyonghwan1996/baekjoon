import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // 최소 힙 구현을 위한 우선순위 큐
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            
            if (x == 0) {
                // 배열에서 가장 작은 값을 출력하고 제거
                if (minHeap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(minHeap.poll());
                }
            } else {
                // 배열에 자연수 x를 추가
                minHeap.offer(x);
            }
        }
        
        scanner.close();
    }
}
