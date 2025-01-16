package chapter04;

import java.util.Scanner;

public class SignRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int retry;
        int n;
        // do-while 문에 의해 반복되는 루프 바디로 수정
        do{
            System.out.println("정수 값: ");
            n = sc.nextInt();

            if (n > 0)
                System.out.println("이 값은 양수입니다.");
            else if ( n < 0 )
                System.out.println("이 값은 음수입니다.");
            else
                System.out.println("이 값은 0 입니다.");

            System.out.println("다시 한번? 1- Yes / 0- NO ");
            retry = sc.nextInt();
        }while (retry == 1);

    }
}
