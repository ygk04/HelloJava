package chapter03.lecture;

public class ArithmeticOperatorExample {
    public static void main(String []args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1= " + result1);

        int result2 = v1 - v2;
        System.out.println("result2= " + result2);

        int result3 = v1 * v2;
        System.out.println("result3= " + result3);

        int result4 = v1 / v2;
        System.out.println("result4= " + result4);

        int result5 = v1 % v2; // % : 나머지 연산 (moduld)
        System.out.println("result5= " + result5);

        double result6 = v1 / v2; // int 결과를 double로 자동 형변환
        System.out.println("result6= " + result6); // 소수점으로 출력 되도록 수정

    }
}
