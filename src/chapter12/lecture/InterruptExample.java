package chapter12.lecture;

class PrintThread2 extends Thread {
    @Override
    public void run() {
        /*try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {} // 인터럽트 발생 시 스레드가 종료되도록 설계*/

        while(true) {
            System.out.println("실행 중");
            if(this.isInterrupted()) {
                break;
            }
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        
        thread.interrupt(); // thread를 종료하기 위해 InterruptedException을 발생시킴
    }
}
