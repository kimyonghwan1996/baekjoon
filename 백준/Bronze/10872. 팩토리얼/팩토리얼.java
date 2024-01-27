import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        System.out.println(fack(N));
        
    }
    public static long fack(long N){
        if (N == 0) return 1;
    
        return N * fack(N-1);
    
    }
}
