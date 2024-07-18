package swea;

import java.util.*;
public class SWEA_1206_View {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int t = 1; t <= 10; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 2; i < n-2; i++) {
                if (arr[i] > arr[i-1] && arr[i] > arr[i-2] && arr[i] > arr[i+1] && arr[i] > arr[i+2]){
                    sum += Math.min(Math.min(Math.min(arr[i] - arr[i-1], arr[i] - arr[i-2]), arr[i] - arr[i+1]), arr[i] - arr[i+2]);
                }
            }
            System.out.println("#"+t + " "+ sum);
        }
    }
}
/*
* 가로를 세로로 생각하자
* 숫자를 입력 받으면 배열에 담는다.
* 배열에 입력 받고 for문을 돈다.
* 두번째 숫자부터 n-2까지 돈다. 10이면 2~8까지만
* 조건문
* arr[n] > arr[n-1] && arr[n] > arr[n-2] && arr[n] > arr[n+1] && arr[n] > arr[n+2}
* min 구하고 sum에 더하기
* 출력
* */