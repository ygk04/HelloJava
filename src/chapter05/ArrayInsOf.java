package chapter05;

import java.util.Scanner;

// 배열 삽입 및 리턴
public class ArrayInsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이: ");
        int num = sc.nextInt();

        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print(i + " 번째 방의 값을 입력: ");
            array[i] = sc.nextInt();
        }
        System.out.print("삽입 할 인덱스: ");
        int idx = sc.nextInt();

        System.out.print("삽입 할 값: ");
        int value = sc.nextInt();


        int[] insertedArray = arrayInsOf(array, idx, value );

        PrintArray.printIntArray(insertedArray);
    }
    public static int[] arrayInsOf(int[] src, int idx, int value ) {
        if (idx < 0 || idx >=src.length ) { // 0 ~ src.length-1, 배열 범위 밖 idx < 0, idx >= src.length
            return src.clone();
        } else { // idx가 유효한 경우
            int[] newArray = new int[src.length+1];

            for (int i=0; i < idx; i++) {
                newArray[i] = src[i];
            }
            newArray[idx] = value;
            for (int i=idx; i < src.length; i++) {
                newArray[i+1] = src[i];
            }
            return newArray;
        }

    }



}
