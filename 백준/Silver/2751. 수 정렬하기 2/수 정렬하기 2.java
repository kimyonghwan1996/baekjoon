
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int data : list){
            sb.append(data).append('\n');
        }
        System.out.println(sb);

        
        //int[] arr = new int[n];
        //for(int i = 0; i < arr.length; i++){
        //    arr[i] = Integer.parseInt(br.readLine());
       // }
        
        //quickSort(arr);
        //for (int i=0; i<arr.length; i++) {
        //    System.out.println(arr[i]);
        //}
    }
}