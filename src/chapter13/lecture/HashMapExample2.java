package chapter13.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    private int sno;

    private String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        return sno == ((Student)o).sno && Objects.equals(name, ((Student)o).name);
    }

    @Override
    public int hashCode() {
        int result = sno;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "홍길동"), 80);
        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(2, "김철수"), 90);
        map.put(new Student(3, "김영희"), 100);

        // 삭제 : remove(Student student);
        map.remove(new Student(2, "김철수"));

        for (Student key : map.keySet()) {
            int score = map.get(key);

            map.put(key, score - 5);
        }

        System.out.println("총 Entry 수: " + map.size());
        System.out.println(map);
    }
}
