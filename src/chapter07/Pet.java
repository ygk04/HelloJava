package chapter07;

public class Pet {
    protected String name;
    protected String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    // 이름롹인
    public String getName() {
        return name;
    }
    // 주인 이름롹인
    public String getMasterName() {
        return masterName;
    }

    // 자기소개
    public void introduce() {
        System.out.println("저의 이름:" + name + "입니다.");
        System.out.println("주인님의 이름:" + masterName + "입니다.");
    }

}
