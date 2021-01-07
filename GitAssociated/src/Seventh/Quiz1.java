package Seventh;

public class Quiz1 {
    public static void main(String[] args) {
        // 1) 노 클래스 버전으로 만들어보자!
        //   스타트업 회사에 4명의 직원이 있다.
        //   이 직원들의 급여는 최소 2400 이상이며
        //   이들간의 차이는 최대 1200 정도라고 가정한다.
        //   각각의 랜덤한 연봉을 출력해보도록 만들어보자!
        final int MEMBERNUM = 4;
        int[] startMemberAccount = new int[MEMBERNUM];

        for(int i = 0; i < MEMBERNUM; i++) {
            // Math.random * 1201: 0 ~ 1200
            startMemberAccount[i] = (int)(Math.random() * 1201) + 2400;
            System.out.println(
                    "스타트업 멤버의 연봉 = " + startMemberAccount[i]);
        }
    }
}
