package chapter07.lecture;

public class ClassB {
    public void method() {
        ClassA a = new ClassA(); // 접근 가능
        a.field = "value";
        a.method();
    }
}
