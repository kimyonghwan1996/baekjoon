import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] ar = new String[size];
        
        for(int i = 0; i < ar.length; i ++){
            ar[i] = sc.next();
        }
        for(int i = 0; i < ar.length; i ++){
            System.out.println(ar[i].charAt(0) +""+ ar[i].charAt(ar[i].length()-1));

        }
        
    }
}
