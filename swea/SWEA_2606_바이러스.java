package swea;

import java.util.*;
public class SWEA_2606_바이러스 {
    static int[][] arr;
    static boolean[] visited;
    static int node, edge;
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();
        arr = new int[node+1][node+1];
        visited = new boolean[node+1];
        for (int i = 0; i < edge; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        count = 0;
        bfs();
        System.out.println(count);
    }
    static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        while (!q.isEmpty()){
            int temp = q.poll();
            for (int i = 1; i <= node; i++) {
                if (!visited[i] && arr[temp][i] == 1){
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }
}

