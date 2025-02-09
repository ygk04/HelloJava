package chapter07.accessmodifier;

import chapter07.lecture.ClassA;

public class ClassC extends ClassA {
    public ClassC() {
        // 상속 받았기 떄문에 접근 가능
        super();
        this.field ="value";
        this.method();
    }

}
