package chapter11.lecture;


import java.time.LocalDate;

public class ToStringExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        LocalDate obj2 = LocalDate.of(2025, 2, 10);

        System.out.println(obj1.toString());
        // toString() 메서드를 호출하지 않아도 자동으로 프린트에서 자동으로 호출
        System.out.println(obj2.toString());
    }
}
