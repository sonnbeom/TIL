package swea;

import java.util.*;
public class SWEA_1204_최빈수_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            sc.nextInt();
            int[] arr = new int[101];
            int[] input = new int[1000];

            for (int j = 0; j < 1000; j++) {
                int score = sc.nextInt();
                input[j] = score;
                arr[score] += 1;
            }

            int maxFreq = 0;
            List<Integer> answerList = new ArrayList<>();

            for (int score = 0; score < 100; score++){
                int freq = arr[score];

                if (freq == maxFreq){
                    answerList.add(score);
                }
                else if (freq > maxFreq){
                    maxFreq = freq;
                    answerList = new ArrayList<>();
                    answerList.add(score);
                }
            }
            int max = 0;
            for(int answer: answerList){
                if (max < answer){
                    max = answer;
                }
            }
            System.out.println("#" + (i+1) +" "+ max);
        }
    }
}