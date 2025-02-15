package chapter08.lecture;

// 중첩 클래스의 접근 제한
// 바깥 필드와 메소드에서 사용 제한
// 바깥에서 inner 클래스 접근
public class AA {
    // 인스턴스 필드 (모든 내부클래스 객체 생성 가능)
    B field1 = new B();
    C filed2 = new C();

    // 인스턴스 메소드 (모든 내부클래스 객체 생성 가능)
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    // 정적 필드 초기화
    // static B field3 = new B();
    static C field4 = new C();

    static void method2() {
        //B var1 = new B();
        C var2 = new C();
    }

    // 인스턴스 클래스
    class B {} // 정적 멤버에서 객체 생성 불가

    // 정적 클래스
    static class C {} // 모든 멤버에서 가능
}
