package chapter04;

import java.util.Scanner;

public class Soft3Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();

        System.out.print("정수 b : ");
        int b = sc.nextInt();

        System.out.print("정수 c : ");
        int c = sc.nextInt();

        // a가 최대값이 아니 경우 변수 swap
        if ( a > b ) {
            int tmep = a;
            a = b;
            b = tmep;
        }if (a > c ){
            int tmep = a;
            a = c;
            c = tmep;
        }if (b > c ) {
            int tmep = b;
            b = c;
            c = tmep;
        }
        System.out.println("a <= b <= c 가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");// 최소값
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");
    }

}
