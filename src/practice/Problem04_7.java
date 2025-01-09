package practice;

import java.util.Scanner;

public class Problem04_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean needRun = true;

        int balance = 0;

        while (needRun) {

            System.out.println("------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("------------------------");
            System.out.print("선택> ");

            int cmd = sc.nextInt();

            switch (cmd) {
                case 1: // 예금
                    System.out.print("예금액> ");
                    int deposit = sc.nextInt();

                    balance += deposit;
                    break;
                case 2: //출금
                    System.out.print("출금액> ");
                    int withdrawal = sc.nextInt();

                    if(balance >= withdrawal) {
                        balance -= withdrawal;
                    }else {
                        System.out.println("잔고가 부족합니다.");
                    }
                    break;
                case 3: // 잔고
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;

                case 4: //종료
                    needRun = false;
                    break;
                default:
                    System.out.println("프로그램 종료");
            }
        }

    }
}
