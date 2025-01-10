package chapter04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

        int a;
        do{
            System.out.print("양의 정수 값: ");
            a = sc.nextInt();
        }while (a <=0);

        while (a >= 0) {

            System.out.println(a--);
        }    //System.out.println("a의 값이 " + a + "가 됐습니다.");
            Thread.sleep (1000);

    }
}
