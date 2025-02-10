package chapter13.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> participantList = new ArrayList<>(List.of(new String[]{"a", "b", "c"}));
        List<String> completionList = new ArrayList<>(Arrays.asList("홍길동", "이승종", "돌쇠"));

        for (String name : completionList) {
            participantList.remove(name);
        }

        System.out.println(participantList);
    }

    public String solution(String[] participant, String[] completion) {

        List<String> participantList = new ArrayList<>(List.of(participant));
        List<String> completionList = new ArrayList<>(List.of(completion));

        for(String name : completionList) {
            participantList.remove(name);
        }

        return participantList.get(0);
    }
}
