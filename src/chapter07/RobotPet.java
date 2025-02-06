package chapter07;

public class RobotPet extends Pet{

    private String name;
    private String masterName;



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

   public RobotPet(String name, String masterName) {
        super(name, masterName);
   }

   // 가사일 하기
    public void work(int sw) {
        switch (sw) {
            case 0:
                System.out.println("청소를 합니다.");
                break;
            case 1:
                System.out.println("세탁를 합니다.");
                break;
            case 2:
                System.out.println("밥을 합니다.");
                break;
        }

    }

}
