package Twentieth;

public class PerformanceTest2 {
    final static int ZERO = 0;
    final static int END5 = 1000000000;
    final static int START5 = 800000001;
    final static int END4 = 800000000;
    final static int START4 = 600000001;
    final static int END3 = 600000000;
    final static int START3 = 400000001;
    final static int END2 = 400000000;
    final static int START2 = 200000001;
    final static int END = 200000000;
    final static int START = 1;
    final static double COEFFICIENT = Math.pow(10, -15);
    final static double DEG2RAD = 180.0;

    public static void main(String[] args) {
        double sum = ZERO;
        double sum2 = ZERO;
        double sum3 = ZERO;
        double sum4 = ZERO;
        double sum5 = ZERO;

        PerformanceUtil.performanceCheckStart();

        for(int i = START; i <= END; i++) {
            sum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        for(int i = START2; i <= END2; i++) {
            sum2 += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        for(int i = START3; i <= END3; i++) {
            sum3 += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        for(int i = START4; i <= END4; i++) {
            sum4 += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        for(int i = START5; i <= END5; i++) {
            sum5 += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        System.out.println("sum5 = " + sum5);

        PerformanceUtil.performanceCheckEnd();

        //System.out.println("sum = " + sum);

        PerformanceUtil.printPerformance();
    }
}
