package Sixth;

import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {
        // 피보나치 수열을 프로그래밍으로 구현해보자!
        // 구체적으로 13번째 항의 숫자를 구하도록 만들어보자!
        //
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .......
        System.out.println("13 번째 피보나치 항을 구해보자!");

        int[] arr = new int[13];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        // 문제.
        // 위의 코드를 n 번째 항을 찾는 형태로 변경해보자!
    }
}
