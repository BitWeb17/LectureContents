package Twentieth;

public class PerformanceTest {
    public static void main(String[] args) {
        double sum = 0;

        PerformanceUtil.performanceCheckStart();

        for(int i = 1; i <= 1000000000; i++) {
            sum += (i * (Math.pow(10, -15) * i)) * Math.sin(i * Math.PI / 180.0);
        }

        PerformanceUtil.performanceCheckEnd();

        System.out.println("sum = " + sum);

        PerformanceUtil.printPerformance();
    }
}
