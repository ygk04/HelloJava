package chapter04;

import java.util.Scanner;

// 입력을 받고 해당 숫자가 5로 나누어지는 판별
public class GoInto5 {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 : ");
        int n = sc.nextInt();

        if (n > 0)
            if(n % 5 == 0 )
                System.out.println("이 값은 5로 나누어집니다. ");
        else
                System.out.println(" 이 값은 5로 나누어 지지 않습니다.");
        else
            System.out.println("음의 정수를 입력했습니다.");


    }
}
