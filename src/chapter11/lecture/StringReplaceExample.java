package chapter11.lecture;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다. java is good";
        String newStr = oldStr.replace("자바", "JAVA");

        // replaceAll은 정규식 지원함
        String newNewStr = oldStr.replaceAll("[aeiou]", "");
        // [aeiou] 중 하나의 문자를 찾는 정규식 패턴
        // 대괄호 []안에 포함된 문자 중하나라도 일치하는 문자를 찾음

        System.out.println(oldStr);
        System.out.println(newStr);
        System.out.println(newNewStr);

    }
}
