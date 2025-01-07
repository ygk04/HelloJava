package chapter02.lecture;

public class StackExample {

    static int classVariable = 5; // 클래스 변수(메서드 영역, 프로그램 시작 시 단 한번 적재, 종료시 제거)

    public static void main(String[] args){
        int mainVariable = 10; //main 메서드의 지역 변수
        System.out.println("Main 메서드 시작");

        someMethod(); //다른 메서드를 호출

        System.out.println("Main 메서드 종료");

    }

    public static void someMethod(){
       int methodVariable = 20; // someMetho의 지역 변수
       System.out.println("SomeMethod 시작" + methodVariable + "클래수 변수 : " + classVariable );

        anotherMethod();

        System.out.println("SomeMethod 끝");
    }

    public static void anotherMethod(){
        int anotherVariable = 30; // anotherMetho의 지역 변수
        System.out.println("anotherMethod 시작" + anotherVariable + "클래수 변수 : " + classVariable);

        System.out.println("anotherMethod 끝");
    }
}
