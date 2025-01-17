package chpater05;

import java.util.Scanner;

public class ArrayClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int num = sc.nextInt();
        int[] inputArray = new int [num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a[" + i + "]=");
            inputArray[i] = sc.nextInt();
        }

        /*int[] clonedArray = arrayClone(inputArray);*/
        int[] clonedArray = new int[inputArray.length];

        System.arraycopy(inputArray,0, clonedArray, 0, inputArray.length);

        System.out.print("복제된 배열: ");
        PrintArray.printIntArray(clonedArray);

    }

    public static int[] arrayClone(int[] arr) {
        int[] newArr = new int[arr.length];
        // 값을 복제하는 로직 추가 (반복문 사용)
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }


}
