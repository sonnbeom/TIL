package TIL.lamda;

import java.util.stream.*;
import java.util.*;

public class 람다_문제풀이 {
    public static void main(String[] args) {
        String[] strArr = {"a", "bb", "ccc", "dddd"};
        Stream<String> stringStream = Stream.of(strArr);

        IntStream intStream = stringStream.mapToInt(String::length);

//        int sum = intStream.sum();
//        System.out.println(sum);
        int max = intStream.max().getAsInt();
        System.out.println(max);

        IntStream intStream1 = new Random().ints(1, 46);
        int answer = 0;
        intStream1.
                distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);
    }
}
