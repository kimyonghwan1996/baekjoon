import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// class Meeting {
//     int start;
//     int end;

//     public Meeting(int start, int end) {
//         this.start = start;
//         this.end = end;
//     }
// }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] ar = new int[n][2];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j ++){
                ar[i][j] = sc.nextInt();
            }
        }

        // 종료 시간을 기준으로 오름차순 정렬
        // Arrays.sort(meetings, Comparator.comparingInt(m -> m.start));
        // Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));

        Arrays.sort(ar, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2){
                if(s1[1] == s2[1]) {
                    return s1[0] - s2[0];
                }
                else {
                    return s1[1] - s2[1];
                }
            }
        });

        int count = 1;
        int endTime = ar[0][1];

        for(int i = 1; i < n; i ++){
            if (ar[i][0] >= endTime) {
                // if (ar[i][0] == ar[i][1]) {
                //     count++;
                //     endTime = ar[i][1];
                //     continue;
                // }
                count++;
                endTime = ar[i][1];
            }
            
        }
        // for (int i = 1; i < n; i++) {
        //     if (meetings[i].start >= endTime) {
        //         if (meetings[i].start == meetings[i].end) {
        //             count++;
        //             endTime = meetings[i].end;
        //             continue;
        //         }
        //         // 다음 회의의 시작 시간이 현재 회의의 종료 시간보다 크거나 같다면 회의를 추가
        //         count++;
        //         endTime = meetings[i].end;
        //     }
        // }

        System.out.println(count);
    }
}
