package Eighth;

class MyOrder {
    int thirdSum = 0;
    int fifthSum = 0;

    int start = 0;
    int end;

    public void setRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // 3, 6, 9, 12, 15, 18, 21, 24, 27, 30
    // 5, 10, 15, 20, 25, 30
    public void processRange() {
        for(int i = start; i <= end; i++) {
            if(i % 3 == 0) {
                thirdSum += i;
            }

            if(i % 5 == 0) {
                fifthSum += i;
            }
        }
    }

    public int getTargetValue() {
        System.out.println("3의 배수 합 = " + thirdSum);
        System.out.println("5의 배수 합 = " + fifthSum);

        return thirdSum - fifthSum;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // 1) 3 의 배수는 더하고 5 의 배수는 뺀다.
        //    덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자!
        //    마지막으로 두 값의 합을 return(반환)하도록 매서드를 만들어보자!
        MyOrder mo = new MyOrder();

        mo.setRange(1, 30);
        mo.processRange();

        System.out.println(
                "3의 배수합 - 5의 배수합 = " + mo.getTargetValue());
    }
}
