package chapter04.lecture;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        // 2단 부터 9단 까지
        // 홀수만 (int m = 3; m <=9; m += 2 )
        for(int m = 2; m <=9; m++) {
            System.out.println("***" + m + "단 ***");

            // m 단을 출력하는 반복문
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + "x " + n + " = " + m * n);

            }

            System.out.println();
        }
    }
}
