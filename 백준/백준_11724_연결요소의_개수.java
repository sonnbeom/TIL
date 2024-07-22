package 백준;

import java.util.*;

public class 백준_11724_연결요소의_개수 {
    static int node;
    static int edge;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();
        int count = 0;

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];

        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        for (int i = 1; i <= node; i++) {
            if (!visited[i]){
                bfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int depth){
        visited[depth] = true;
        for (int i = 1; i <= node; i++) {
            if (arr[depth][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()){
            int temp = queue.poll();
            for (int i = 1; i <= node ; i++) {
                if (arr[temp][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
