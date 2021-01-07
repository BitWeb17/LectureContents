package Seventh;

public class Homework2 {
    public static void main(String[] args) {
        final int ARRSIZE = 7;
        // 2) 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!

        int[] arr = new int[ARRSIZE];

        for(int i = 0; i < ARRSIZE; i++) {
            arr[i] = (int)(Math.random() * 5) + 3;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
