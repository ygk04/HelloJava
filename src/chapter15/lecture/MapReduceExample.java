package chapter15.lecture;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 각 숫자를 제곱한 후, 그 합을 구하는 예제
        int sumOfSquares = numbers.stream() // 스트림 객체 생성 (일회용)
                .map(n -> n * n) // 숫자 제곱
                .reduce(0, (a, b) -> a + b);

        System.out.println("제곱의 총합 : " + sumOfSquares);

    }
}
