package chapter04;

import java.util.Random;
import java.util.Scanner;

public class FingerFlashing2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] hands = {"가위", "바위", "보"}; // 0 ,1 ,2

        System.out.println("--------------------------------");
        System.out.println("0. 가위 1. 바위 2.보  99. 종료 ");
        System.out.println("--------------------------------");
        System.out.print("입력 > ");

        int myHand = sc.nextInt();
        int computerHand = rand.nextInt(3);

        System.out.print("컴퓨터가 낸 것: ");
        displayHand(computerHand);

        System.out.println("내가 낸 것 :");
        displayHand(myHand);


        if(myHand == computerHand) {
            System.out.println("비겼습니다");
        }else if ((myHand == 0 && computerHand == 2) || (myHand == 1 && computerHand == 0) || (myHand == 2 && computerHand == 1)) {
                System.out.println("이겼습니다");
        }else {
        System.out.println("졌습니다");
        }


        switch (computerHand){
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
        System.out.print("내가 낸 것: ");

        switch (myHand){
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
        System.out.println("");


    }

    public static void displayHand(int hand){
        switch (hand){
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }

        System.out.println("");
    }

}