package chapter12.lecture;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<10; i++) {
            toolkit.beep();
            try {
                // 메인 스레드를 3초 동안 일시 정지 상태로 보내고
                Thread.sleep(3000);
                // 3초가 지나면 다시 실행 준비 상태로 돌아옴
            } catch (InterruptedException e) {}
        }
    }
}