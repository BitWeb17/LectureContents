package Twentieth;

public class PerformanceUtil {
    public static long startTime;
    public static long estimatedTime;

    public static void performanceCheckStart() {
        startTime = System.currentTimeMillis();
    }

    public static void performanceCheckEnd() {
        estimatedTime = System.currentTimeMillis() - startTime;
    }

    // 값을 가져오는 단위가 ms(1 / 1000 초)
    public static void printPerformance() {
        System.out.println(
                "걸린 시간: " + estimatedTime / 1000.0 + " s");
    }
}
