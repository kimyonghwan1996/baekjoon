

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     //노드 수
    //     int m = sc.nextInt();
    //     int v = 1;
    //     boolean[] visited = new boolean[n+1];

    //     LinkedList<Integer>[] adjList = new LinkedList[n + 1];

        
    //     for (int i = 0; i <= n; i++) {
    //         adjList[i] = new LinkedList<Integer>();
    //     }

    //     int[][] graph = new int[m][2];
    //     for(int i = 1; i < m; i ++){
    //         graph[i][0] = sc.nextInt();
    //         graph[i][1] = sc.nextInt();
    //     }
    //     System.out.println(bfs(1, graph, visited));
    // }

    // static String bfs(int start, int[][] graph, boolean[] visited) {
	// 	// 탐색 순서를 출력하기 위한 용도
	// 	StringBuilder sb = new StringBuilder();
	// 	// BFS에 사용할 큐를 생성해줍니다.
	// 	Queue<Integer> q = new LinkedList<Integer>();
		 
	// 	// 큐에 BFS를 시작 할 노드 번호를 넣어줍니다.
	// 	q.offer(start);
		
	// 	// 시작노드 방문처리
	// 	visited[start] = true;
		
	// 	// 큐가 빌 때까지 반복
	// 	while(!q.isEmpty()) {
	// 		int nodeIndex = q.poll();
	// 		sb.append(nodeIndex + " -> ");
	// 		//큐에서 꺼낸 노드와 연결된 노드들 체크
	// 		for(int i = 0; i < graph.length; i++) {
    //             if(graph[nodeIndex][i] != 0 && !visited[i]) {
    //                 visited[i] = true;
    //                 q.offer(i);
    //             }
    //         }
	// 	}
	// 	// 탐색순서 리턴
	// 	return sb.toString() ;
	// }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수 
		int m = sc.nextInt(); // 간선의 개수 
		int v = 1; // 탐색을 시작할 정점의 번호 

		boolean visited[] = new boolean[n + 1]; // 방문 여부를 검사할 배열 

		LinkedList<Integer>[] adjList = new LinkedList[n + 1];

		for (int i = 0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}

		// 두 정점 사이에 여러 개의 간선이 있을 수 있다.
		// 입력으로 주어지는 간선은 양방향이다.
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}

		for (int i = 1; i <= n; i++) { 
			Collections.sort(adjList[i]); // 방문 순서를 위해 오름차순 정렬 
		}

		bfs_list(v, adjList, visited);
	}

	// BFS - 인접리스트 
	public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[v] = true; 
		queue.add(v);
        int cnt = 0;

		while(queue.size() != 0) { 
			v = queue.poll(); 
            cnt++;

			Iterator<Integer> iter = adjList[v].listIterator();
			while(iter.hasNext()) { 
				int w = iter.next(); 
				if(!visited[w]) { 
					visited[w] = true; 
					queue.add(w); 
				} 
			}
		}
        System.out.println(cnt-1);
	}
}
