
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String,String> tm = new TreeMap(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine()) ;
        for(int i = 0; i< n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(b.equals("leave")){
                tm.remove(a);
            }
            else if (b.equals("enter")) {
                tm.put(a, b);
            }
        }

        for(String data : tm.keySet()){
            System.out.println(data);
        }

    }
}
