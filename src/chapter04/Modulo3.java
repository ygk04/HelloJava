package chapter04;

import java.util.Scanner;

public class Modulo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" 정수값 : ");
        int n = sc.nextInt();

        if (n > 0) { //양수
            if (n % 3 == 0) {
                System.out.println("이 값은 3으로 나누어 집니다.");
            } else if(n % 3 == 1) {
                System.out.println("이 값을 3으로 나는 나머지는 1입니다.");
            } else { // n % 3 == 2
                System.out.println("이 값을 3으로 나는 나머지는 2입니다.");
            }
        } {// 음수
            System.out.println("이 값은 양수가 아닙니다.");
        }
    }

}
