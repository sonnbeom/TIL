package 백준;

import java.util.*;
public class 백준_2667_단지번호붙이기 {
    static int node, sum;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static class Node{
        int x;
        int y;
        public Node(int y, int x){
            this.x = x;
            this.y = y;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        arr = new int[node][node];
        visited = new boolean[node][node];

        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < node; i++) {
            String input = sc.next();
            for (int j = 0; j < node; j++){
                int temp = input.charAt(j) - '0';
                arr[i][j] = temp;
            }
        }

        sum = 0;

        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                if (arr[i][j] == 1 && !visited[i][j]){
                    bfs(i, j);
                    list.add(sum);
                    count++;
                    sum = 0;
                }
            }
        }
        System.out.println(count);
        int[] homeCount = new int[count];
        for (int i = 0; i < count; i++) {
            homeCount[i] = list.get(i);
        }
        Arrays.sort(homeCount);
        for (int answer : homeCount){
            System.out.println(answer);
        }
    }
    static void bfs(int y, int x){
        visited[y][x] = true;
        sum++;

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(y,x));

        while (!q.isEmpty()){
            Node temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int tempX = temp.x + dx[i];
                int tempY = temp.y + dy[i];
                if (tempX >= 0 && tempY >= 0 && tempY < node && tempX < node){
                    if (!visited[tempY][tempX] && arr[tempY][tempX] == 1){
                        q.add(new Node(tempY, tempX));
                        visited[tempY][tempX] = true;
                        sum++;
                    }
                }
            }
        }

    }


    static void dfs(int y, int x){
        visited[y][x] = true;
        sum++;

        for (int i = 0; i < 4; i++) {
            int tempX = x + dx[i];
            int tempY = y + dy[i];
            if (tempX < node && tempY < node && tempX >=0 && tempY >= 0){
                if (!visited[tempY][tempX] && arr[tempY][tempX] == 1){
                    dfs(tempY, tempX);
                }
            }
        }
    }
}
