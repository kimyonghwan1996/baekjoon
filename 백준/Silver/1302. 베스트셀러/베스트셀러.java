
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        TreeMap<String,Integer> hm = new TreeMap<>();

        int n = Integer.parseInt(st.nextToken()) ; //보석갯수
        for(int i = 0; i< n; i ++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            if(hm.containsKey(a)){
                hm.put(a, hm.get(a)+1);
            }
            else {
                hm.put(a, 1);
            }
        }
        int maxSales = 0;
        String bestSeller = "";
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String bookTitle = entry.getKey();
            int sales = entry.getValue();
            if (sales > maxSales || (sales == maxSales && bookTitle.compareTo(bestSeller) < 0)) {
                maxSales = sales;
                bestSeller = bookTitle;
            }
        }

        bw.write(bestSeller + "\n");
        bw.flush();

        br.close();
        bw.close();
        
    }
}
