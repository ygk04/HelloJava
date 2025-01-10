package chapter04;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월을 입력하세요:");

        int month = sc.nextInt();

        int daysInMonth;

        // 31일 달 : 1, 3, 5, 7, 8, 10, 12
        // 30일 달 : 4, 6, 9, 11
        // 28일 달 : 2
        // 간단한 예제로 윤년 (4년주기로 2월은 29일)은 고려하지 않음)
        // 1 ~ 12 까지 입력이 아닌 경우는 "유효하지 않음" 출력
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               daysInMonth = 31;
               break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.println("없습니다");
                return;
        }

        System.out.println(month + "월은" + daysInMonth + "일까지 잇습니다");
    }
}
