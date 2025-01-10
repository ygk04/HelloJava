package chapter04;

import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int x;

        do{
            System.out.print("세 자리의 정수값: ");
            x = sc.nextInt();

        } while ( x < 100 || x > 999); // 세자리 인지 검증하고 세자리가 아니라면 다시 입력받기

        System.out.println("입력한 값은" + x + "입니다.");
    }
}
