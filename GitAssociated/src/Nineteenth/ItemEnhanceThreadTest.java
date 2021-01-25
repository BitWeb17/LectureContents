package Nineteenth;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ItemEnhanceThreadTest {
    private Semaphore sem = new Semaphore(3);

    public void enter(Item item) {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            return;
        }

        try {
            item.enhance(this);
        } finally {
            sem.release();
        }
    }

    public static class Item {
        private static int cnt = 0;
        private int num = ++cnt;

        private void enhance(ItemEnhanceThreadTest iet) {
            System.out.println("강화 시작!");

            Random rand = new Random();

            try {
                Thread.sleep(rand.nextInt(5000) + 5000);
            } catch (InterruptedException e) {

            }

            System.out.println(num + "번 아이템 강화 종료!");
        }
    }

    // Mutex는 Thread 1개만 활용할 수 있는 Lock이라 보면 되겠다.

    // ------------
    // | lock = 1 |  특정한 메모리 주소 공간 (SL)
    // ------------

    // SL에 값이 1 이냐 ? 아니냐 ?
    // 1이면 현재 Lock 상태니까 들어오지마!
    // 0이면 현재 Unlock 상태니까 먼저 들어오는 넘이 임자!

    // ------------
    // | lock = 1 |  특정한 메모리 주소 공간 (SL1)
    // ------------
    // | lock = 2 |  특정한 메모리 주소 공간 (SL2)
    // ------------
    // | lock = 3 |  특정한 메모리 주소 공간 (SL3)
    // ------------

    // SL1, 2, 3중 빈게 있냐 ? 없냐 ?
    // 있으면 먼저 들어오는 넘이 임자!
    // 없으면 못들어오니까 돌아가렴 ~

    // synchronized 같은 경우에는 Mutex 개념으로
    // Thread 여러개가 동시다발적으로 구동이 불가능한 반면
    // Semaphore는 Mutex List 같은 개념으로
    // Thread 여러개가 동시다발적으로 구동이 가능하다.

    // Mutex와 Semaphore의 차이점이 무엇인가 ?
    // 대기열이 있다 없다.
    public static void main(String[] args) {
        final ItemEnhanceThreadTest iet = new ItemEnhanceThreadTest();

        for(int i = 0; i < 6; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Item item = new Item();
                    iet.enter(item);
                }
            });
            t.start();
        }
    }
}
