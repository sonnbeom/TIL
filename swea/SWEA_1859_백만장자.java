package swea;

import java.util.*;

public class SWEA_1859_백만장자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int profit = 0;
            int temp = 0;
            for (int j = n-1; j >= 0 ; j--) {
                if (temp <= arr[j]){
                    temp = arr[j];
                }else {
                    profit += temp - arr[j];
                }
            }
            System.out.println("#"+i+" "+profit);
        }
    }
}
