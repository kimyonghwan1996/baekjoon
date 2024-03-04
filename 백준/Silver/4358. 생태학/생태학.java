import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        int cnt = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals("")) {
                break;
            }
            else if(!tm.containsKey(str)){
                tm.put(str, 1);
                cnt++;
            }
            else {
                tm.put(str, tm.get(str)+1);
                cnt++;
            }
        }
        for (String key : tm.keySet()) {

            System.out.println(key + " " + String.format("%.4f", (double)tm.get(key)/cnt*100));
        
        }

    }
}
