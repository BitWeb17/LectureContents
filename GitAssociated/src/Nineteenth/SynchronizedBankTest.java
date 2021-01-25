package Nineteenth;

class C extends Thread {
    public void run() {
        for(int i = 0; i < 1000000; i++) {
            SynchronizedBankTest.sb.plusMoney(3000);
        }

        //SynchronizedBankTest.sb.plusMoney(3000);

        System.out.println("plusMoney(3000): " +
                SynchronizedBankTest.sb.getMoney());
    }
}

class D extends Thread {
    public void run() {
        for(int i = 0; i < 1000000; i++) {
            SynchronizedBankTest.sb.minusMoney(1000);
        }

        //SynchronizedBankTest.sb.minusMoney(1000);

        System.out.println("minusMoney(1000): " +
                SynchronizedBankTest.sb.getMoney());
    }
}

public class SynchronizedBankTest {
    public static SynchronizedBank sb = new SynchronizedBank();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("원금: " + sb.getMoney());

        C c = new C();
        D d = new D();

        c.start();
        d.start();
    }
}
