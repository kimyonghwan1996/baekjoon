
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); //
        int v = sc.nextInt();
        int[][] graph = new int[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1; // 양방향 간선이므로 두 번째 인덱스도 같이 처리
        }
        System.out.println(dfs(v, graph, visited)); // DFS 결과 출력
        visited = new boolean[n + 1]; // DFS 이후 방문 여부 초기화
        System.out.println(bfs(v, graph, visited)); // BFS 결과 출력
    }

    static String dfs(int node, int[][] graph, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        dfsRecursive(node, graph, visited, sb);
        return sb.toString().trim();
    }

    static void dfsRecursive(int node, int[][] graph, boolean[] visited, StringBuilder sb) {
        visited[node] = true;
        sb.append(node).append(" ");

        for (int next = 1; next < graph.length; next++) {
            if (graph[node][next] == 1 && !visited[next]) {
                dfsRecursive(next, graph, visited, sb);
            }
        }

    }
    static String bfs(int start, int[][] graph, boolean[] visited) {
		StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");

            for (int next = 1; next < graph.length; next++) {
                if (graph[node][next] == 1 && !visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }

        return sb.toString().trim();
    }
	
    
}
