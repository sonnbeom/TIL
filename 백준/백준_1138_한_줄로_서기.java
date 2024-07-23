package 백준;

import java.util.Scanner;

public class 백준_1138_한_줄로_서기 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] answer = new int[n+1];

      for (int i = 1; i <= n; i++) {
        int seq = sc.nextInt();
        for (int j = 1; j <=n ; j++) {
            if (seq == 0){
                if (answer[j] == 0){
                    answer[j] = i;
                    break;
                }
                else {
                    continue;
                }
             }
            else if(answer[j] == 0){
                seq--;
            }
          }
        }
        for (int i = 1; i <=n ; i++) {
            System.out.print(answer[i]+ " ");
        }
    }
}


/*
  0. for문을 돌린다.
* 1. 입력받은 input이 0이다 본인이 설 위치임
* 1 - 2. 서야할 곳이 비어있다면 스면 된다.
* 1 - 3. 서야할 곳이 비어있다면 다음 j로 넘긴다
* 2. 입력받은 input이 0이 아니다. => 본인이 설 위치가 아님.
* 2-1. input을 1 감소시킨다.
2-2 . 다음 반복문으로 넘어간다.
* */