package chapter04;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // 정수 n을 입력 받아서 1부터 n까지의 제곱을 출력하시요

        System.out.println("정수 값: ");
        int n = sc.nextInt();
        //1. 변수또는 객채 선언
        //2. 해당 로직 수행
        //3.출력
        for (int i = 1; i <= n ; i++)
            System.out.println(i + "의 제곱은" + i * i +"입니다.");

        // 에시 ) n =2
        // "1의 제곱은 1입니다.
        // "2의 제곰은 4입니다.
    }

}
