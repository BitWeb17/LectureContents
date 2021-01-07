package Seventh;

public class Homework6 {
    public static void main(String[] args) {
        // 6) 5번 문제에서 출력한 값들을 출력하지 않고
        // 배열에 저장하고 출력하도록 한다.
        int cnt = 0;
        int[] arr = new int[100];

        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                arr[cnt] = i;
                // printf 내부에서 여러 변수를 사용한다면
                // 맨 뒤쪽에서 ++을 해야 가장 마지막에 적용된다.
                System.out.printf("arr[%d] = %d\n", cnt, arr[cnt++]);
            }
        }
    }
}
