package swea;

import java.util.*;
public class SWEA_20551_증가하는_사탕 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }
            int count = 0;
            for (int j = 0; j < 2; j++) {
                // arr[1] - arr[2]이 0보다 크다
                int diff = arr[2 - j - 1] - arr[2 - j];
                if (diff >= 0 && arr[2-j-1] -1 -diff > 0){
                    arr[2-j-1] -= 1 + diff;
                    count += diff+1;
                }
            }
            boolean success = true;
            for (int j = 0; j < 2; j++) {
                if (arr[j] >= arr[j + 1]) {
                    success = false;
                    break;
                }
            }
            if (success){
                System.out.println("#"+i+" "+count);
            }else {
                System.out.println("#"+i+" "+-1);
            }
        }

    }
}

/*
2 1 j = 0 2-j 2- j-1
1 0     1 0
* 이미 조건이 되어있는 경우
* arr[0] < arr[1] < arr[2]
* ans = 0
*  5 4 3
* arr[1] - arr[2] > 0
* int diff = arr[1] - arr[2]
* if(arr[1] -= (1+diff) > 0){
*   arr[2] -= (1+diff)
* }
* else{
*  할 수 없어!
* }
*
* */