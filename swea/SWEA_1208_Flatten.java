package swea;

import java.util.*;
public class SWEA_1208_Flatten {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            int dump = sc.nextInt();
            int[] arr = new int[100];

            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < dump; i++) {
                Arrays.sort(arr);
                arr[0] += 1;
                arr[99] -= 1;
            }
            Arrays.sort(arr);
            int ans = arr[99] - arr[0];
            System.out.println("#"+ t + " " + ans);
        }
    }
}
/*
* 0. 배열을 입력받고 정렬한다. 왜 정렬? for문을 다 돌고 max로 if문을 통해 비교하면 리소스가 많을 것 같다.
* 1. 정렬 후(내림차순)
* 1-1 가장 작은 숫자가 두번째로 작은 숫자만큼 더해준다. 채택!
* 1-2 1씩 뺀다.
* 마지막으로 정렬후 첫번째 idx과 마지막 idx를 비교한 값을 ans에 할당한다.
* */