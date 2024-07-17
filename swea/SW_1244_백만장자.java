package swea;

import java.util.Scanner;

public class SW_1244_백만장자 {
    static int trial;
    static int arr[];
    static int max = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String num = sc.next();
            arr = new int[num.length()];
            trial = sc.nextInt();

            for(int j = 0; j < arr.length; j++){
                arr[j] = num.charAt(j) - '0';
            }

            // 이 부분이 없으면 시간 초과가 된다.
            if (arr.length < trial){
                trial = arr.length;
            }

            dfs(0);

            System.out.println("#"+(i+1)+" " + max);

            //max를 초기화해주지 않으면 그보다 작은 값이 나왔을 때 기존 max가 출력되어 오답이 된다.
            max = 0;
        }

    }
    static void dfs(int depth){
        if (depth == trial){
            int result = 0;
            for (int i = 0; i < arr.length; i++){
                result += arr[arr.length - i - 1] * Math.pow(10, i);
            }
            max = Math.max(result, max);
            return;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                swap(i, j);

                dfs(depth+1);

                swap(i, j);
            }
        }

    }
    static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}