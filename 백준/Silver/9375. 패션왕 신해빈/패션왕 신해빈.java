
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];

        for(int i = 0; i <n; i ++){
            HashMap<String,Integer> hm = new HashMap<String,Integer>();
            int m = Integer.parseInt(br.readLine());
            for(int j = 0; j <m; j ++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str1 = st.nextToken();
                String str2 = st.nextToken();
                if (hm.containsKey(str2)) {
                    hm.put(str2, hm.get(str2) + 1);
                } else {
                    hm.put(str2, 1);
                }
            }
            int mul = 1;
            int sum = 0;
            for (int val : hm.values()) {
                mul *= (val+1);
            }

            System.out.println(mul - 1);
            
        }
        
    }
}
