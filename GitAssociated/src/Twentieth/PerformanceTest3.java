package Twentieth;

public class PerformanceTest3 {
    final static int ZERO = 0;
    final static int END = 1000000000;
    final static int START = 1;
    final static double COEFFICIENT = Math.pow(10, -15);
    final static double DEG2RAD = 180.0;

    public static void main(String[] args) {
        double sum = ZERO;

        Thread[] thr = new Thread[5];

        for(int i = 0; i < 5; i++) {
            thr[i] = new Thread(new AccelThread(START, END, 5, i));
        }

        PerformanceUtil.performanceCheckStart();

        for(int i = 0; i < 5; i++) {
            thr[i].start();

            // sum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        PerformanceUtil.performanceCheckEnd();

        System.out.println("sum = " + sum);

        PerformanceUtil.printPerformance();
    }
}
