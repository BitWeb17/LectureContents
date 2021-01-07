package Seventh;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = scan.nextInt();

        int[] arr = new int[num + 1];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i <= num; i++) {
            arr[i] = arr[i - 3] + arr[i - 1];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        System.out.printf("위배열 %d항의 숫자는? %d", num, arr[num]);
    }
}
