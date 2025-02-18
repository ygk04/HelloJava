package chapter12.lecture;

import java.awt.*;

public class BeepTask implements Runnable {

    @Override
    public void run() {
        System.out.println("BeepTask 시작");
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

        System.out.println("BeepTask 종료");
    }
}
