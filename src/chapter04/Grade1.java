package chapter04;

import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 점수 : ");
        int point = sc.nextInt();

        if(point >= 0 && point <= 49) { // 0 ~ 49
            System.out.println("가");
    } else if (point >= 50 && point <= 59 ) { //50 ~ 59
            System.out.println("양");
        } else if (point >= 60 && point <= 69 ) { //60 ~ 69
            System.out.println("미");
        }else if (point >= 70 && point <= 79 ) { //70 ~ 79
            System.out.println("우");
        }else if (point >= 80 && point <= 100 ) { //80 ~ 100
            System.out.println("수");
        }else{
            System.out.println("잘못된 점수입니다.");
        }

        }
    }
