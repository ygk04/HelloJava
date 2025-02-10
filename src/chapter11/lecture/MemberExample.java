package chapter11.lecture;

class Member extends Object {
    public String id;

    public Member (String id) {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return id.equals(member.id);
        } else {
            return false;
        }
    }
}

public class MemberExample {
    public static void main(String[] args) {
        // 메모리 주소가 다른 객체들 생성
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {// 문자열 내용이 같기 때문에 true
            System.out.println("obj1과 obj2은 동등합니다.");
        } else {
            System.out.println("obj1과 obj2은 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)) {// 문자열 내용이 같기 때문에 true
            System.out.println("obj1과 obj3은 동등합니다.");
        } else {
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
    }

}
