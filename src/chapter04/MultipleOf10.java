package chapter04;

import java.util.Scanner;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" 정수값 : ");
        int n = sc.nextInt();

        if( n > 0 )
            if( n % 10 == 0 )
                System.out.println(" 이 값은 10로 나누어집니다.");
        else
                System.out.println(" 이 값은 10로 나누지지 않습니다.");
        else
            System.out.println(" 음의 정수를 입력 하셨습니다. ");
    }
}
