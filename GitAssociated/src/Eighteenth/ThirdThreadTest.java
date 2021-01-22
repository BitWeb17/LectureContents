package Eighteenth;

import java.util.Random;

public class ThirdThreadTest implements Runnable {
    private String name;

    public ThirdThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();

        for(int i = 0; i < 15; i++) {
            System.out.println(name + ": " + rand.nextInt(100));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThirdThreadTest("t1"));
        Thread t2 = new Thread(new ThirdThreadTest("t2"));

        // 데몬 프로세스: init(1) 프로세스가 직접 개입하여
        //             심판을 내리기 전까지는 죽지 않는 불멸의 프로세스
        //             (그래서 서비스 운영에서 밥먹듯이 사용됨)
        t2.setDaemon(true);

        t1.start();

        // main()을 sleep() 하고자 한다면
        // 반드시 Thread의 동작을 모두 완료한 이후에 sleep() 시키도록 한다.
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {

        }

        t2.start();
        System.out.println("main() 실행중");
    }
}
