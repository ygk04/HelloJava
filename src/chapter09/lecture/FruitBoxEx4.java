package chapter09.lecture;

import java.util.Collections;
import java.util.Comparator;

// 과일들을 정렬해보자
public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        // 정렬 전
        System.out.println("----- 정렬 전 -----");
        System.out.println(appleBox);
        System.out.println(grapeBox);

        // 정렬 후
        System.out.println("----- 정렬 후 -----");
        // 익명 구현 객체
        Collections.sort(appleBox.getList(), new Comparator<Apple>() {
            // 비교 방식 구현
            // Comparator 의 compare 메서드 반환값이 양수일때 swap
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.weight - o2.weight; // 양수일 때
            }
        });
        // 람다식
        Collections.sort(grapeBox.getList(), (o1, o2) -> o1.weight - o2.weight);

        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println("----- 한번 더 -----");
        // 구현 객체
        Collections.sort(appleBox.getList(), new FruitCompDesc());
        Collections.sort(grapeBox.getList(), new FruitCompAsc());

        // Comparable 구현 : 오름차순
        Collections.sort(appleBox.getList());
        Collections.sort(grapeBox.getList());

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
