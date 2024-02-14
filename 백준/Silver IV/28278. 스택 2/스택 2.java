import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < m; i++) {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stt.nextToken());
            if (n == 1) {
                st.push(Integer.parseInt(stt.nextToken()));
            } else if (n == 2) {
                if (st.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(st.pop() + "\n");
                }
            } else if (n == 3) {
                bw.write(st.size() + "\n");
            } else if (n == 4) {
                if (st.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (n == 5) {
                if (st.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(st.peek() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
