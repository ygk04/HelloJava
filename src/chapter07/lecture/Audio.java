package chapter07.lecture;

import chapter07.RemoteControl;

public  class Audio extends RemoteControlDevice {

    // 필드
    private int volume;

    // 추상 메소드들의 실체 메소드들
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME)
            this.volume = MAX_VOLUME;
        else if (volume < MIN_VOLUME)
            this.volume = MIN_VOLUME;
        else
            this.volume= volume;

        System.out.println(" 현재 Audio의 볼륨 : "  + this.volume);
    }
}
