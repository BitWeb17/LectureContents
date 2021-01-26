package Twentieth;

public class PerformanceTest2 {
    final static int ZERO = 0;
    final static int END = 1000000000;
    final static int START = 1;
    final static double COEFFICIENT = Math.pow(10, -15);
    final static double DEG2RAD = 180.0;

    public static void main(String[] args) {
        double sum = ZERO;

        PerformanceUtil.performanceCheckStart();

        for(int i = START; i <= END; i++) {
            sum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        PerformanceUtil.performanceCheckEnd();

        System.out.println("sum = " + sum);

        PerformanceUtil.printPerformance();
    }
}
