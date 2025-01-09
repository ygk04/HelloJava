package chapter04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int targetNumber = 10 + rand.nextInt( 90 ); // 맞춰야 하는 숫자 : 10 ~ 99 중에 생성

        System.out.println("숫자 맞추기 게임 시작! ");
        System.out.println("1부터 99사이의 숫자를 맞추세요.");

        int guessNumber;
        int n;
        do {
            System.out.print(" 숫자 : ");
            n = sc.nextInt();

            if( n >= 1 ) {
                if (n > targetNumber) {
                    System.out.println(" 다운 입니다.");
                } else if (n < targetNumber) {
                    System.out.println(" 업 입니다.");

                } else {
                    System.out.println(" 정답 입니다.");
                }
            }
        } while ( n != targetNumber );
    }
}
