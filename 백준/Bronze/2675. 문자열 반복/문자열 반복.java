import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        //String[] ar = new String[];
        for(int i =0; i < n; i++){
            String str = "";
            int m = sc.nextInt();
            String z = sc.next();
            String ar[] = z.split("");
            for (int j = 0; j < ar.length; j++){
                str += ar[j].repeat(m);
             }
            System.out.println(str);
        }
    }
}
