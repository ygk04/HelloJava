package chapter13.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();

        set1.add("Java");
        set1.add("JDBC");
        set1.add("Servlet/JSP");
        set1.add("Java"); // 중복 데이터
        set1.add("iBATIS");

        int size = set1.size();
        System.out.println("총 객체 수: " + size);

        Iterator<String> iterator = set1.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set1.remove("JDBC");
        set1.remove("iBATIS");

        System.out.println();

        for (String element : set1) {
            System.out.println("\t" + element);
        }

        set1.clear();
        System.out.println(set1);
        
        if(set1.isEmpty()) {
            System.out.println("비어있음");
        }

        Set<Member> set2 = new HashSet<Member>();
        
        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));
        // 인스턴스는 다르지만 내부 데이터가 동등하다고 판단하려면
        // HashSet의 경우 hashcode()와 equals를 구현해주어야 함;

        System.out.println(set2);
        System.out.println("총 객체 수 : " + set2.size()); // 1개
    }
}

class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;

        return age == ((Member)o).age && Objects.equals(name, ((Member)o).name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + age;
        return result;
    }
}