package Nineteenth;

public class FailedBank {
    private int money = 100000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus) {
        int m = getMoney();

        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + plus);
    }

    public void minusMoney(int minus) {
        int m = getMoney();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minus);
    }
}
