
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        //int n = Integer.parseInt(br.readLine());
        //int[] ar = new int[9];
        int sum = 0, check = 0;
        for(int i = 0; i < 9; i++){
            //ar[i] = Integer.parseInt(br.readLine());
            list.add(i, Integer.parseInt(br.readLine()));
			sum += list.get(i);
        }
        
        Collections.sort(list);
        //System.out.println(sum);
        
        for(int i = 0; i < list.size()-1; i++){   
            for(int j = i + 1; j < list.size(); j++ ){
                check = sum- list.get(i) - list.get(j);
                if (check  == 100) {
                    list.remove(j);
                    list.remove(i);
                    break;
                }
            }
            if (check == 100) break;
            
        }         
        for (Integer e : list) {
            System.out.print(e + "\n");
        }
    }
}
