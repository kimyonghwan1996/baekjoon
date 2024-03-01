
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.HashSet;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer> hs1 = new HashMap<>();
        HashMap<Integer,Integer> hs2 = new HashMap<>();
        HashSet<Integer> hs3 = new HashSet<>();

        st =new StringTokenizer(br.readLine());
        for(int i=0; i<n; i ++){
            int a = Integer.parseInt(st.nextToken());
            hs3.add(a);
        }
        st =new StringTokenizer(br.readLine());
        for(int i=0; i<m; i ++){
            int a = Integer.parseInt(st.nextToken());
            if (hs3.contains(a)) {
                hs3.remove(a);
            }
            else hs3.add(a);
        }
        
        System.out.println(hs3.size());
    }
}
