package chapter06;

import java.util.Scanner;

public class Absoulute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("int형 정수 a의 값: ");
        int a = sc.nextInt();
        System.out.print("long형 정수 b의 값: ");
        long b = sc.nextInt();
        System.out.print("float형 정수 c의 값: ");
        float c = sc.nextInt();
        System.out.print("double형 정수 d의 값: ");
        double d = sc.nextInt();

        System.out.println("a의 절대값은 " + absoulute(a) + "입니다.");
        System.out.println("b의 절대값은 " + absoulute(b) + "입니다.");
        System.out.println("c의 절대값은 " + absoulute(c) + "입니다.");
        System.out.println("d의 절대값은 " + absoulute(d) + "입니다.");

    }

    private static int absoulute(int x) {
        return x >= 0? x : -x;
    }

    private static long absoulute(long x) {
        return x >= 0? x : -x;
    }

    private static float absoulute(float x) {
        return x >= 0? x : -x;
    }

    private static double absoulute(double x) {
        return x >= 0? x : -x;
    }



}
