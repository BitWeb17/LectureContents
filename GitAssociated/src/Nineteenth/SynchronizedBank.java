package Nineteenth;

public class SynchronizedBank {
    private int money = 100000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void plusMoney(int plus) {
        int m = getMoney();

        /*
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

        System.out.println("m = " + m);

        setMoney(m + plus);
    }

    // synchronized 키워드를 통해서
    // 강제로 Thread 간의 순서를 조정해줄 수 있다.
    // 그러므로 서로 화장실 들어가겠다고 싸우는
    // Race Condition을 무마할 수 있다.
    public synchronized void minusMoney(int minus) {
        int m = getMoney();

        /*
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

        System.out.println("m = " + m);

        setMoney(m - minus);
    }
}
