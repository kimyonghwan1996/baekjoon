import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] ar = new int [N];

		
		for(int i = 0; i < M; i++) {
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			int c = scan.nextInt();
			
			for(int j = a; j <= b; j++) {
				ar[j] = c;	
			}
		}
		
		for (int i = 0; i < N; i++) {
            System.out.print(ar[i] + " ");
            }

		}
	}
