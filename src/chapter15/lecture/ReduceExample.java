package chapter15.lecture;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // reduce를 사용하여 모든 숫자의 합 구하기
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // a와 b를 더함 (초기값은 0)

        System.out.println("총 합은 " + sum + "입니다.");

    }
}
