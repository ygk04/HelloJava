package chapter04;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("실수 a: ");
        double a = sc.nextDouble();

        System.out.print("실수 b: ");
        double b = sc.nextDouble();

        double max;

        if ( a > b) {
            max = a;
        } else   { // a <= b
            max = b;
        }

        // 큰 값을 max에 저장 해주세요.

        System.out.println(" 큰쪽의 값은 " + max + "입니다.");
    }
}
