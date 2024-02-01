
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int j = 0; j < n; j++) {
            String vps = br.readLine();
            char[] ar = vps.toCharArray(); // 문자열을 문자 배열로 변환
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == '(') {
                    stack.push(ar[i]);
                } else if (ar[i] == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
