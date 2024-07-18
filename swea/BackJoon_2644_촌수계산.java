package swea;

import java.util.*;

public class BackJoon_2644_촌수계산 {
    static int[][] arr;
    static int start, end, answer, n;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        start = sc.nextInt();
        end = sc.nextInt();
        answer = 0;

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int fi = sc.nextInt();
            int se = sc.nextInt();
            arr[fi][se] = 1;
            arr[se][fi] = 1;
        }
        dfs(start, 0);
        if (answer == 0){
            System.out.println(-1);
        }else {
            System.out.println(answer);
        }


    }
    static int dfs(int depth, int count){
        if (depth == end){
            answer = count;
        }
        visited[depth] = true;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && arr[depth][i] == 1){
                dfs(i, count+1);
            }
        }
        return -1;
    }
}
/*
* 1. 이차원 배열에서 연결된 노드들을 1로 채운다
* 2. dfs 호출
* 3. dfs ->  방문 시에 방문했다는걸 알아야 접근 안 할 수 있음
* visited를 만들자
* for문을 돌고 -> 1부터 n까지
* 만약 방문하지 않았고 해당 arr == 1이라면
* dfs(i)를 호출하자
* 그럼
* * */