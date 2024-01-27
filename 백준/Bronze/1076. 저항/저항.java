import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int A = 0, B = 0;
        long C = 1;

        String color[] = {"black", "brown", "red", "orange", "yellow", 
                          "green", "blue","violet","grey","white"};
        for(int i = 0; i < color.length; i ++){
            if (a.equals(color[i])) {
                A = i;
            }
            if (b.equals(color[i])) {
                B = i;
            }
            if (c.equals(color[i])) {
                for (int j = 1; j < i+1; j++) {
                    C *= 10;
                }
            }
        } 
        System.out.println((A*10+B)*C);               
        
    }

}
