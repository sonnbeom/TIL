package swea;

import java.util.*;

public class SWEA_1954_달팽이_숫자 {
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int N = sc.nextInt();

            int[][] arr = new int[N][N];
            int direction = 0;
            int y = 0;
            int x = 0;

            for (int j = 1; j <= N * N; j++) {
                arr[y][x] = j ;
                y += dy[direction];
                x += dx[direction];

                if (y < 0|| x < 0 || y >= N || x >= N || arr[y][x] != 0){

                    y -= dy[direction];
                    x -= dx[direction];
                    direction = (direction+1) % 4;

                    y += dy[direction];
                    x += dx[direction];
                }
            }
            System.out.println("#"+i);
            for (int j = 0; j < N; j++) {
                for (int k = 0; k <N ; k++) {
                    System.out.print(arr[j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
/*
* 우측으로 가다가
*  우, 하, 좌 ,상 반복할 수 있게 만든다.
* ->  y축 x축 배열을 만들어야 한다.
* -> 배열의 인덱스를 정하고 방향을 바꿔야 하는 경우 인덱스를 바꿔줘야 한다
* -> 0 1 2 3 반복해야 하므로 +1한 후 %4를 해주면 된다.
* 3에서 방향 전환한 경우 3+1 4로 나누고 나머지므로 0이 나와 0 1 2 3 무한 반복 가능하다
* 그렇다면 언제 방향을 전환해야할까?
* 끝에 도달(배열을 벗어난 경우) 좌 우 모두 해당된다.
* 1. y, x가 n을 벗어난 경우(정사각형이다)
* 2. 이미 존재하는 숫자를 만난 경우(이미 방문한 것이다)
* 3. y, x가 0보다 작은 경우(배열을 벗어난다.)
* 방향을 바꿔줘야 한다.
*
* for문을 돌며 칸에 i를 채운다.
* 내가 얼마나 이동할지를 정한다. 방향변수는 유지하고 칸만 이동한다.
* 조건문을 통해 이동하려는 칸에 접근할 수 있느지 판단한다.
* 칸 이동할 한 것을 롤백한다.
* 접근할 수 없다면 방향 값에 +1 을 더하고 %4를 하여 나머지를 할당한다.
* 방향을 바꿨으면 다시 반복
* */