import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 퀵 정렬 수행
        quickSort(arr, 0, N - 1);

        // 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 파티션 분할
            int partitionIndex = partition(arr, low, high);

            // 분할된 부분에 대해 재귀적으로 퀵 정렬 수행
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // 피벗을 기준으로 작은 값들은 왼쪽으로, 큰 값들은 오른쪽으로 이동
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 피벗과 arr[i+1]을 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
