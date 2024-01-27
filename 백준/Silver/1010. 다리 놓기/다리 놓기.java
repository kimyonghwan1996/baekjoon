import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for (int i=0; i<count; i++){
			int N = in.nextInt();
			int M = in.nextInt();
			System.out.println(bridgeCount(N,M));
		}
		}
	public static long bridgeCount(int N, int M){
		long[][] dp = new long[N+1][M+1];
		for (int i = 0; i <= M; i++) {
			dp[0][i] = 1;
			dp[1][i] = i;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = i; j <= M; j++) {
				dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
			}
		}
		return dp[N][M];
	}
}
