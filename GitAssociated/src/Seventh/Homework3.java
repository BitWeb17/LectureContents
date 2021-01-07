package Seventh;

public class Homework3 {
    public static void main(String[] args) {
        // 3) 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
        //    위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!
        final int FIXVALUE = 20;
        final int START = 3;

        int[] series = new int[FIXVALUE];

        series[0] = 1;
        series[1] = 1;
        series[2] = 3;

        for(int i = START; i < FIXVALUE; i++) {
            series[i] = series[i - 3] + series[i - 1];
            System.out.printf("series[%d] = %d\n", i, series[i]);
        }

        System.out.printf("이 수열의 20 번째 항은 = " + series[FIXVALUE - 1]);
    }
}
