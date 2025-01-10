package chapter04;

import java.util.Scanner;

public class PutAsteriskFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 *를 표시 할까요?: ");

        int n = sc.nextInt();

        if (n > 0) {
            int i=0;
            while ( i < n ) {
                System.out.println("*");
                i++;
            }
            System.out.println();
        }
    }
}
