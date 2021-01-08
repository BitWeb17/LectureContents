package Eighth;

public class MySeries {
    // 이름이 같은 매서드의 입력 인자가 달라지면
    // 함수 오버로딩이 일어나면서 양쪽을 모두 사용할 수 있게 된다.
    // 입력 개수가 다르기 때문에 자바 컴파일러가 알아서 구별해준다.
    public void printValue(int start, int end, int orderNum) {
        int cnt = 1;

        for(int i = start; i <= end; i++) {
            if(i % orderNum == 0) {
                System.out.printf("%3d", i);

                if(cnt % 5 == 0) {
                    System.out.println("");
                }
                cnt++;
            }
        }
    }

    public void printValue(int start, int end) {
        int cnt = 1;

        for(int i = start; i <= end; i++) {
            System.out.printf("%3d", i);

            if(cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }

    public int valueSum(int start, int end) {
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
}
