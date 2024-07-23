package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_15903_카드합체놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long [] card = new long[n];

        for (int i = 0; i < n; i++) {
            card[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            Arrays.sort(card);
            long sum = card[0] + card[1];
            card[0] = card[1] = sum;
        }
        long answer = 0;
        for(long t : card){
            answer += t;
        }
        System.out.print(answer);
    }
}
/*
1. 큰 틀 int 배열 정렬
2. 정렬 배열의 0번째, 첫번째 숫자를 더한 sum을 배열의 0번째, 1번째를 sum으로 대체함
3. 2를 무한 반복후

1000 * 15 =15000
1000개 정렬
for문 15000번
* */