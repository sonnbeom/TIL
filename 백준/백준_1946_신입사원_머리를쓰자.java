package 백준;

import java.util.Scanner;

public class 백준_1946_신입사원_머리를쓰자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] grade = new int[n+1];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                grade[a] = b;
            }
            int score = grade[1];
            int count = 1;
            for (int j = 2; j <= n; j++) {
                if (score > grade[j]){
                    count++;
                    score = grade[j];
                }
            }
            System.out.println(count);
        }
    }
}
