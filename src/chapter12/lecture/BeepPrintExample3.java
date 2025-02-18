package chapter12.lecture;

public class BeepPrintExample3 {
    public static void main(String[] args) {

        System.out.println("메인 메소드 시작");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 작업 시작");
                for (int i = 0; i < 5; i++) {
                    System.out.println("익명");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
                System.out.println("익명 작업 종료");
            }
        });
        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }

        System.out.println("메인 메소드 종료");
    }
}
