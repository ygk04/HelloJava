package chapter07;


// 로봇 펫은 name, masterName(주인 이름)을 필드로 갖고 있음
// 필드와 관련된 getter는 전부 구현할 것
// 로봇 펫은 자기 소개(introduce)와 가사일(work)을 할 수 있음
public class SkinnableRobotPet extends RobotPet implements Skinnable{
    private int skin;

    public SkinnableRobotPet(String name, String masterName, int skin){
        super(name, masterName);
        this.skin = skin;
    }

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    // 현재 스킨 표시
    public String printSkin() {
        switch (skin) {
            case BLACK:
                System.out.print("검정");
                break;
            case RED:
                System.out.print("빨강");
                break;
            case GREEN:
                System.out.print("초록");
                break;
            case BLUE:
                System.out.print("파랑");
                break;
            case YELLOW:
                System.out.print("노랑");

        }
        return "Unknown";
    }


}
