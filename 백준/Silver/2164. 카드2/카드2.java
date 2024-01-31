import java.util.LinkedList;
import java.util.Scanner;
//큐 백준 2164
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> qu = new LinkedList<Integer>(); // 큐의 생성
        for(int i = 1; i <= n; i ++){
            qu.add(i);
        }
        while (qu.size()>1) {
            qu.poll();
            int temp = qu.poll();
            qu.add(temp);
        }
        System.out.println(qu.poll());
    }
}
