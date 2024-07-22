package 백준;

import java.util.*;
public class 백준_1946_신입사원 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b= sc.nextInt();
                map.put(a, b);
            }
            for (int j = 1; j <= n; j++) {
                int key = j;
                int value = map.get(j);
                for (int k = 1; k <= n; k++) {
                    if(map.get(k) == null){
                        continue;
                    }
                    if (key > k && value > map.get(k)){
                        map.remove(key);
                        break;
                    }
                }
            }
            System.out.println(map.size());
        }
    }
}
/*
*
*
3 6 탈락 2 5에 밀림
7 3 탈락 4 2에 밀림
4 2
1 4
5 7 탈락 4 2에 밀림
2 5 탈락 1 4에 밀림
6 1

*
* */