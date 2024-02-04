
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//백준 10773
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Stack<Integer> st = new Stack<Integer>();
         int sum = 0;
         int n = sc.nextInt();

         for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            if (m == 0) {
                st.pop();
            }
            else st.push(m);
         }

         int size = st.size();

         for(int i=0; i < size; i++){
            sum += st.peek();
            st.pop();
         }
         System.out.println(sum);
    }
}
