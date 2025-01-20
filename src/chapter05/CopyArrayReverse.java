package chapter05;

import java.util.Scanner;

public class CopyArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = sc.nextInt();
        int[] oldArray = new int[n];
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i +"] = ");
            oldArray[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            newArray[i] = oldArray[oldArray.length - i -1];
            // i=0일때 newArray[0] = oldArray[3-0-1] = oldArray[2]
        }

        System.out.println("oldArray의 모든 요소를 역순으로 복사 했습니다.");
        PrintArray.printIntArray(newArray);



    }
}
