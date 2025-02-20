package chapter12.lecture;

class ThreadA extends Thread {
    public ThreadA() {
        setName("ThreadA"); // 스레드 이름 설정
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName() + "가 출력한 내용"); // ThreadA 실행 내용
        }
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName() + "가 출력한 내용"); // ThreadB 실행 내용
        }
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름: " + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름: " + threadB.getName());
        threadB.start();
    }
}
