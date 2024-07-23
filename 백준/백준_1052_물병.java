package 백준;

import java.util.*;

public class 백준_1052_물병 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = moveWater(n, k);
        System.out.println(answer);

    }
    static int moveWater(int n ,int k){;
        for (int i = 0; i < k-1; i++) {
            int base = 0;
            while (Math.pow(2, base)< n){
                base ++;
            }
            n -= Math.pow(2, base-1);
            if (n == 0){
                return 0;
            }
        }
        int base = 0;
        while (Math.pow(2,base) < n){
            base ++;
        }
        return (int) Math.pow(2, base) - n;

    }
}

