package chapter06;

import java.util.Scanner;

public class SignOf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        char sign = signOf(x); // '+', '-' 출력하는 부호 판별 메서드

        System.out.println("signOf(x)는" + sign + "입니다.");
    }

    public static char signOf(int n){
        char sign = 0;

        if (n > 0)
            sign = '+';
        else if (n < 0)
            sign = '-';


        return sign;
    }

}
