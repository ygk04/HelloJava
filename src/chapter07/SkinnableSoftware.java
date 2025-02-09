package chapter07;

public class SkinnableSoftware implements Skinnable {


    int skin; // 스킨 색

    public SkinnableSoftware() {
        this.skin = BLACK; // 검은색 기본으로
    }

    public SkinnableSoftware( int skin) {
        this.skin = skin;
    }

    public int getSkin() {
        return skin;
    }

    public String getSkinString() {
        switch (skin) {
            case BLACK:
                return "BLACK";
            case RED:
                return "RED";
            case GREEN:
                return "GREEN";
            case BLUE:
                return "BLUE";
            case YELLOW:
                return "YELLOW";
            default:
                return "Unknown";
        }
    }

    // 인터페이스의 모든 추상 메서드를 구현해야하며,
    //수현하지 않을 거라면 추상 클래스로 수정해야 함
    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }
}
