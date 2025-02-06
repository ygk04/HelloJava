package chapter07.lecture;

public class MyClassExample {
    public static void main(String[] args) {
        System.out.println("1)--------------");

        MyClass myClass1 = new MyClass(); // rc =  new Television(); 으로 초기화
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)--------------"); // rc =  new Audio(); 으로 초기화
        MyClass myClass2 = new MyClass(new Audio());


        System.out.println("3)--------------");
        MyClass myClass3 = new MyClass();
        myClass3.methodA(); // 메소드 내 지역 변수 new Audio(); 를 이용해서 출력

        System.out.println("4)--------------");
        MyClass myClass4 = new MyClass();
        myClass4.methodB(new Television()); // 매개값으로 넘긴 new Television(); 를 이용해서 출력

    }
}
