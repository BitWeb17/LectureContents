package Eighth;

public class MySeries {
    public final int AND = 3;
    public final int OR = 4;

    // 이름이 같은 매서드의 입력 인자가 달라지면
    // 매서드 오버로딩이 일어나면서 양쪽을 모두 사용할 수 있게 된다.
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

    public void printTwiceOrder(int start, int end,
                                int orderNum1, int orderNum2,
                                final int ORDER) {
        int cnt = 1;

        for(int i = start; i <= end; i++) {
            // OR 인지 AND 인지에 따라 다른 동작을 취해야함
            switch (ORDER) {
                case AND:
                    if(i % orderNum1 == 0 && i % orderNum2 == 0) {
                        System.out.printf("%3d", i);

                        if(cnt % 5 == 0) {
                            System.out.println("");
                        }
                        cnt++;
                    }
                    break;

                case OR:
                    if(i % orderNum1 == 0 || i % orderNum2 == 0) {
                        System.out.printf("%3d", i);

                        if(cnt % 5 == 0) {
                            System.out.println("");
                        }
                        cnt++;
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public int valueSum(int start, int end) {
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public void fibnacciSeries(int n) {
        int first = 1;
        int second = 1;
        int res = 0;
        int cnt = 1;

        n -= 2;

        System.out.printf("%4d%4d", first, second);

        while(n-- > 0) {
            res = first + second;
            first = second;
            second = res;
            System.out.printf("%4d", res);

            if(cnt % 5 == 3) {
                System.out.println("");
            }
            cnt++;
        }
    }
}
