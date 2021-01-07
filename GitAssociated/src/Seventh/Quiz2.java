package Seventh;

import java.util.Arrays;

class StartUp {
    int[] startMemberAccount;

    public void setRandomPayment(int num) {
        int i;

        startMemberAccount = new int[num];

        for(i = 0; i < num; i++) {
            startMemberAccount[i] = (int)(Math.random() * 1201) + 2400;
        }
    }

    // toString 을 사용하면
    // 클래스 변수의 내부 정보를 System.out.println 으로 확인할 수 있게 된다.
    @Override
    public String toString() {
        return "StartUp{" +
                "startMemberAccount=" + Arrays.toString(startMemberAccount) +
                '}';
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        // 변수의 정의: 특정 데이터타입을 저장할 수 있는 공간
        // 클래스란 결국 ? 일종의 데이터타입
        // new 를 하면서 실제 클래스를 활용할 수 있게된다.
        StartUp su = new StartUp();
        su.setRandomPayment(4);

        System.out.println(su);
    }
}
