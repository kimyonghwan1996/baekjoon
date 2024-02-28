import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        TreeSet<String> sortedSet = new TreeSet<>();

        for (int i = 0; i < n + m; i++) {
            String str = br.readLine();
            if (!set.add(str)) { // If unable to add, it's a duplicate
                sortedSet.add(str);
            }
        }

        bw.write(sortedSet.size() + "\n");
        for (String duplicate : sortedSet) {
            bw.write(duplicate + "\n");
        }

        bw.flush();
        bw.close();
    }
}
