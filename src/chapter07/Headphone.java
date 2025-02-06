package chapter07;

public class Headphone implements Wearable {
    private int volume;

    @Override
    public void putOn() {
        System.out.println("헤드폰를 착용했습니다.");
    }

    @Override
    public void putOff() {
        System.out.println("헤드폰를 벗었습니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을" + volume + "로 변경했습니다.");
    }

}
