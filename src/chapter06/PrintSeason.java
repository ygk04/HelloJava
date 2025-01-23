package chapter06;

import java.util.Scanner;

public class PrintSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;
        // 입력 범위에서 벗어날 경우 다시 입력 받기
        do{
            System.out.print("몇월 입니까?(1~12):");
            month = sc.nextInt();
        } while (month < 1 || month > 12);

        System.out.print("해당 월의 계절은" + pirntSeasson(month) + "입니다");
    }
    // 리턴 타입 void 또는 String
    public static String pirntSeasson(int m) {
        switch (m) {
            case 3: case 4: case 5:
                return  "Spring";
            case 6: case 7: case 8:
                return  "Summer";
            case 9: case 10: case 11:
                return  "Fall";

            case 12: case 1: case 2:
                return  "Winter";
        }
        throw new RuntimeException("유효하지 않은 월 입력");

    }

}
