package chapter04;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 점수 : ");
        int point = sc.nextInt();

        if( point < 0 || point> 100) {
            System.out.println("잘못된 점수입니다.");
        } else if(point >= 80) {
            System.out.println("수");
        } else if (point >=70 ) {
            System.out.println("우");
        } else if (point >=60 ) {
            System.out.println("미");
        }else if (point >= 50 ) {
            System.out.println("양");
        }else  {
            System.out.println("가");
        }


    }
}
