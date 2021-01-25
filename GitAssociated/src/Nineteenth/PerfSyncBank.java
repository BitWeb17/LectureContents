package Nineteenth;

public class PerfSyncBank {
    private int money = 100000;

    private String plusMsg = "";
    private String minusMsg = "";

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus) {
        int m = getMoney();

        // Memory Hierarchy(메모리 계층 구조)
        // 용량이 크면 클 수록 동작 속도가 느리고
        // 속도가 빠르면 빠를수록 용량이 작다.
        // 결론적으로 I/O 를 최소화하면 어떤 프로그램이던 속도가 엄청나게 빨라진다.

        // 최적화의 순서
        // 1) I/O 최소화
        // 2) 알고리즘 & 자료구조
        // 3) 마이크로 아키텍처적 접근(CPU 파이프라인, 캐시, 어셈블리어 등등)

        // 결국 모니터에 출력하는 행위 자체가 I/O 를 빈번하게 발생시키는 것이므로
        // I/O를 최소화 하고자 한다면 한 번에 모아서 출력하면 된다.
        // I/O를 block 단위로 모아 출력하는 방식은 잠시 보류!

        //System.out.println("m = " + m);
        //plusMsg += "m = " + m + "\n";

        // 4096 / 16 = 2^12 / 2^4 = 2^8 = 256

        setMoney(m + plus);
    }

    // synchronized 키워드를 통해서
    // 강제로 Thread 간의 순서를 조정해줄 수 있다.
    // 그러므로 서로 화장실 들어가겠다고 싸우는
    // Race Condition을 무마할 수 있다.
    public void minusMoney(int minus) {
        int m = getMoney();

        //System.out.println("m = " + m);
        //minusMsg += "m = " + m + "\n";

        setMoney(m - minus);
    }

    public String getPlusMsg() {
        return plusMsg;
    }

    public String getMinusMsg() {
        return minusMsg;
    }
}
