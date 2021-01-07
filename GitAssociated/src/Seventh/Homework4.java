package Seventh;

import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        // 4) float 형 배열에 랜덤 값 3 개를 입력해보자!
        final int ARRSIZE = 3;

        float[] arr = new float[ARRSIZE];

        Random rand = new Random();

        for(int i = 0; i < ARRSIZE; i++) {
            // nextFloat은 실수를 뽑으며 범위는 0.0 ~ 1.0
            arr[i] = rand.nextFloat() * 10;
            // %d 는 정수형, %f 는 실수형
            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }
    }
}
