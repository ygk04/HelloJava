package chapter04.lecture;

public class ForPrint1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum +i ; 와 같음
        }

        System.out.println("1 ~ 100의 합 : " + sum);
    }
}
