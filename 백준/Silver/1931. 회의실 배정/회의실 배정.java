import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings, Comparator.comparingInt(m -> m.start));
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));

        int count = 1;
        int endTime = meetings[0].end;

        for (int i = 1; i < n; i++) {
            if (meetings[i].start >= endTime) {
                if (meetings[i].start == meetings[i].end) {
                    count++;
                    endTime = meetings[i].end;
                    continue;
                }
                // 다음 회의의 시작 시간이 현재 회의의 종료 시간보다 크거나 같다면 회의를 추가
                count++;
                endTime = meetings[i].end;
            }
        }

        System.out.println(count);
    }
}
