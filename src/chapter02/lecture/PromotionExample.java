package chapter02.lecture;

public class PromotionExample {
    public static void main(String[]args ){
        //자동 타임 변환(다른 데이터 타입과의 연산을 수행하면 표현 범위가 넓은 쪽으로 자동 형변환이 수행)
        // 표현 크기가 작은 자료형을 큰 자료형에 대입하거나 연산이 발생할 때 컴파일러 자동으로 타입을 변환
        // 1 byte
        byte byerValue = 10;
        // 4 byte
        int intValue = byerValue;
        System.out.println("intValue = " + intValue );

        // 2 byte
        char cahrValue = '가';
        // 4 byte
        intValue = cahrValue;
        System.out.println("가의 유니코드: " + intValue );

        // 4 byte
        intValue = 50;
        // 8 byte
        long longValue = intValue;
        System.out.println("longValue = " + longValue );

        // 8 byte
        longValue = 100;
        // 4 byte
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue );

        // 4 byte
        floatValue = 100.5f;
        // 8 byte
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue ); // soutv

        byte a = 10;
        byte b = 20;
        // byte + byte = int 자료형, short + short = int 자료형
        byte c = (byte) (a + b);
        // 변수가 아닌 정수형 리터럴로 입력하면 RightValue가 byte형으로 변환 하도록 컴파일러가 자동 수행
        c = 10 + 20;

        System.out.println("c = " + c );

    }
}
