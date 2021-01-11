package Ninth;

class WorkRate {
    final int DAYHOUR = 24;

    float rateA;
    float rateB;
    float completeHour;
    float amountOfWork;

    float totalHour;

    int requiredDay;
    int requiredHour;
    int requiredMinute;

    public WorkRate(float hourA, float productionA,
                    float hourB, float productionB, int day) {

        rateA = productionA / hourA;
        rateB = productionB / hourB;
        completeHour = day * DAYHOUR;
        amountOfWork = (rateA + rateB) * completeHour;
    }

    public void calcRemainHour(int accidentDay) {
        fireStop(rateA, accidentDay);

        totalHour = (amountOfWork / (rateA + rateB)) +
                accidentDay * DAYHOUR;
    }

    public void fireStop(float rate, int day) {
        amountOfWork -= rateB * day * DAYHOUR;
    }

    public void printConversionHour2ComfortFormat() {
        System.out.printf("전체 걸리는 시간 = %f\n", totalHour);

        requiredDay = (int)totalHour / 24;
        requiredHour = (int)totalHour % 24;
        requiredMinute = ((int)(totalHour * 10) % 10) * 6;
        // 60 * 0.6 = 60 * 6 / 10

        System.out.printf("완성일은 앞으로 %d일 %d시간 %d분이 " +
                "더 필요할 것으로 추정되고 있습니다.\n",
                requiredDay, requiredHour, requiredMinute);
    }

    public void printInfo() {
        //System.out.println("A의 작업률 = " + rateA);
        //System.out.println("B의 작업률 = " + rateB);
        System.out.println("총 작업량 = " + amountOfWork);
    }
}

public class Homework12 {
    public static void main(String[] args) {
        // 12) A 공장의 생산량은 10 시간에 100개
        //     B 공장의 생산량은 20 시간에 50개다.
        //     10일간 A 공장과 B 공장이 풀 가동해야 완성되는 수량이 있다 가정한다.
        //     어느날 A 공장에 불이나서 3일간 공장이 가동 정지를 했다.
        //     그렇다면 이들은 몇 일 후에 제품을 납품할 수 있을까 ?
        WorkRate wr = new WorkRate(
                10, 100,
                20, 50, 10);

        wr.printInfo();

        wr.calcRemainHour(3);
        wr.printInfo();

        wr.printConversionHour2ComfortFormat();
    }
}
