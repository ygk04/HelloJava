package chapter15.lecture;

@FunctionalInterface
interface Max {
    int max(int a, int b);
}


public class LambdaExample {
    public static void main(String[] args) {
        Max max1 = new Max() { // 익명 객체
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        //람다식 작성2 : 생성자와 반환 타입과 메서드명 제거
        Max max2 = (int a, int b) -> {
            return a > b ? a : b;
        };

        // 람다식 작성3 : 반환 값이 있는 메서드는 return문 대신 식(expression)으로 대신할 수 있음.
        // 괄호 안의 문장이 하나인 경우 괄호를 생략 할 수 있음, 이때 문장의 끝에 ;을 붙이지 않는다
        Max max3 = ((int a, int b) -> a > b ? a : b);

        // return이 들어가면 중 괄호 생략 불가능
        Max max3_1 = (int a, int b) -> {
            return a > b ? a : b;
        };

        // 람다식 작성4 : 람다식에 선언된 매개변수의 타입은 추론이 가능하여 대부분의 경우 생략이 가능
        Max max4 = (a, b) -> a > b ? a : b;

        // 람다식 작성5 : 선언된 매개변수가 하나뿐인 경우에 괄호 생략 가능
        MyCustomFunction myFunction1 = a -> a * a;
        MyCustomFunction myFunction2 = (a) -> a * a;
    }
}
