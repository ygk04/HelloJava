package chapter06;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean needRetry;

        do {
            int a = readPlusNumber();
            printRiversNumber(a);
            needRetry= shouldRetry();

        }while (needRetry);

    }
    public static int readPlusNumber() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("양의 정수값: ");
            n = sc.nextInt();

        }while (n <= 0);
        return n;
    }

    public static void printRiversNumber(int n) {
        StringBuilder sb = new StringBuilder();

        sb.append(n);
        sb.reverse();

        System.out.println("반대로 읽으면 " + sb + "입니다.");
    }
    public static boolean shouldRetry() {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.print("다시 한번?: < Yes...1 /NO...0>: ");
            input = sc.nextInt();
        }while (input != 1 && input != 0 );

        return (input == 1);
    }

}
