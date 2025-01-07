package chapter04.lecture;

import java.util.Scanner;

public class BusFareInDaejeon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("만 나이 입력: ");
        int age = sc.nextInt();

        if (age < 0 ) {
            System.out.println("잘못 입력하셨습니다");
        } else if (age >= 19 ) {
            System.out.println("성인 입니다");
            System.out.println("1500원 입니다");
        } else if (age >= 13 ) {
            System.out.println("청소년 입니다");
            System.out.println("750원 입니다");
        } else if (age >= 6 ) {
                System.out.println("어린이 입니다");
                System.out.println("350원 입니다");
        } else if ( age >= 0) {
            System.out.println("무료 입니다");
        } else {
            System.out.println();
        }
    }
}
