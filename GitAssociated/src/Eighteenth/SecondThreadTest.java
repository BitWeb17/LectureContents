package Eighteenth;

import java.util.Random;

public class SecondThreadTest implements Runnable {
    private String name;

    public SecondThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();

        for(int i = 1; i < 3; i++) {
            System.out.println(name + ": " + random.nextInt(100));

            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {

            }
        }
    }

    // 일단 실행시키면 main()이 프로세스가 된다.
    public static void main(String[] args) {
        // 여기서는 스레드로 만들 내용을 두개 준비한다.
        Thread t1 = new Thread(new SecondThreadTest("t1"));
        Thread t2 = new Thread(new SecondThreadTest("t2"));

        // 스케쥴러에 2개의 스레드를 등록한다.
        t1.start();
        t2.start();

        // 현재 아직 대장 프로세스에게 할당된 시간이 남아있으므로
        // 대장 프로세스는 여기까지 실행하게 된다.
        System.out.println("main() 프로세스 실행중");

        // main() 프로세스 실행중
        // t2: 78
        // t1: 80
        // t1: 93
        // t2: 24

        // 위의 결과에서 파악 해야 하는 내용이
        // 1. 실제 스레드를 실행한다고 바로 실행되는 것이 아니라는 점
        // 2. 현재 sleep()이 0.5초인데
        //    스케쥴링은 압도적으로 빠른 속도로 일어난다.
        //    그런데 왜 t1이 2번 왔는가 ?
        //    ps -ef를 했을때 나오는 여러 프로세스들과 경쟁을 하다가
        //    채택된 것이 t1일 뿐(이것은 상황에 따라 결과가 변할 수 있다)
    }
}
