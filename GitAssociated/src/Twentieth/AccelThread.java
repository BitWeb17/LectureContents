package Twentieth;

import Twentieth.FinalPerformanceTest;

public class AccelThread extends OperationAccelerator implements Runnable {
    private int localStart;
    private int localEnd;
    private int threadId;

    private double localSum = 0;

    private static double totalSum = 0;

    public AccelThread(int start, int end, int maxThreadNum, int id) {
        super(start, end, maxThreadNum);

        int total = end - start + 1;
        int threadPerData = total / maxThreadNum;

        localStart = id * threadPerData + 1;
        localEnd = localStart + threadPerData - 1;
        threadId = id;
    }

    public synchronized void addAll(double localSum) {
        totalSum += localSum;
    }

    @Override
    public void run() {
        System.out.printf("threadId = %d, localStart = %d\n", threadId, localStart);
        System.out.printf("threadId = %d, localEnd = %d\n", threadId, localEnd);

        for(int i = localStart; i <= localEnd; i++) {
            localSum += (i * (FinalPerformanceTest.COEFFICIENT * i)) * Math.sin(i * Math.PI / FinalPerformanceTest.DEG2RAD);
        }

        System.out.printf("threadId = %d, localSum = %f\n", threadId, localSum);

        addAll(localSum);

        System.out.printf("threadId = %d, totalSum = %f\n", threadId, totalSum);
    }
}
