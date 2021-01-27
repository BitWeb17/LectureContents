package Twentieth;

public class FinalPerformanceTest {
    final static int ZERO = 0;
    final static int END = 1000000000;
    final static int START = 1;
    final static double COEFFICIENT = Math.pow(10, -15);
    final static double DEG2RAD = 180.0;

    final static int MAXTHREAD = 5;

    public static void main(String[] args) throws InterruptedException {
        double sum = ZERO;

        Thread[] thr = new Thread[MAXTHREAD];

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i] = new Thread(new AccelThread(START, END, MAXTHREAD, i));
        }

        PerformanceUtil.performanceCheckStart();

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i].start();
            // sum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i].join();
        }

        PerformanceUtil.performanceCheckEnd();
        PerformanceUtil.printPerformance();
    }
}
