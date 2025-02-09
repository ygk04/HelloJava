package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {


            System.out.print("x값:");
            int x = sc.nextInt(); // 실행 에외 : 우리는 int를 예상하지만 사용자가 어떤 값을 입력할지 모름
            System.out.print("y값:");
            int y = sc.nextInt(); // case1: x에 "ABC"가 입력되면 런타임 오류가 발생, InputMismatchException

            System.out.println("x * y = " + x * y);
            System.out.println("x / y = " + x / y); // case2 : y에 0을 입력하면 런 타임 오류가 발생, ArithmticException
        }catch (InputMismatchException e) {
            System.out.println("입력 오류 발생." + e);
            e.printStackTrace();
        }catch (ArithmeticException e) {
            System.out.println("산술 오류 발생." + e);
            e.printStackTrace();
        }finally {
            System.out.println("프로그램을 종료 합니다.");
        }
        // 실행 예외 : 비검사 예외



    }
}
