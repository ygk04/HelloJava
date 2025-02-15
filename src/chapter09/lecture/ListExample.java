package chapter09.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
        public static void main (String[]args){
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Character> charList = new ArrayList<>(Arrays.asList('삼', '이', '일'));
        List<String> strList = new ArrayList<>(Arrays.asList("삼삼", "이이", "일일"));
        List<Boolean> booleanList = new ArrayList<>(Arrays.asList(false, true, true));

        // 메소드 호출 방법, 정적 메소드 기준 : 클래스명.<대입된 타입>메서드 명();
        // ListExample.<Integer>getFirstFromList(intList) : 타입을 직접 대입할 경우에는 클래스명이나 this를 꼬 써줘야 함

        System.out.println(getFirstFromList(intList)); // 대입된 타입을 생략 할수 있음, 컴파일러가 타입 추청
        System.out.println(getFirstFromList(charList));
        System.out.println(getFirstFromList(strList));
        System.out.println(getFirstFromList(booleanList));
    }

    // 메서드 하나로 만들기
    public static <T> T getFirstFromList(List <? extends T> list) {
        return list.get(0);
    }
}

