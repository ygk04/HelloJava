package chapter13.lecture;

import java.util.LinkedList;
import java.util.Queue;

class Customer {
    String name;
    int processingTime; // 처리 시간(초)

    public Customer(String name, int processingTime) {
        this.name = name;
        this.processingTime = processingTime;
    }
}

public class BankQueueSimulation {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();

        // 고객 추가
        queue.offer(new Customer("Alice", 3));
        queue.offer(new Customer("Bob", 2));
        queue.offer(new Customer("Charlie", 5));

        // 대기열 처리
        while (!queue.isEmpty()) {
            Customer current = queue.poll();
            System.out.println(current.name + " 고객 처리 중... (" + current.processingTime + "초)");
            try {
                Thread.sleep(current.processingTime * 1000); // 실제로 대기 시간 시뮬레이션
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(current.name + " 고객 처리 완료!");
        }

        System.out.println("모든 고객이 처리되었습니다.");
    }
}
