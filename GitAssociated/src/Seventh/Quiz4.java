package Seventh;

import java.util.Scanner;

class ProcessOrder {
    int start, end;
    int divNum;

    Scanner scan;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setStart() {
        System.out.print("시작값을 입력하세요: ");
        start = scan.nextInt();
    }

    public void setEnd() {
        System.out.print("끝값을 입력하세요: ");
        end = scan.nextInt();
    }

    public void setDivNum() {
        System.out.print("나누는 수를 입력하세요: ");
        divNum = scan.nextInt();
    }

    public void printOrder() {
        System.out.printf(
                "%d ~ %d 숫자중 %d 로 나눠 떨어지는 숫자 출력!\n",
                start, end, divNum);

        for(int i = start; i <= end; i++) {
            if(i % divNum == 0) {
                System.out.println("결과 = " + i);
            }
        }
    }
}

public class Quiz4 {
    public static void main(String[] args) {
        // 4) 사용자 입력으로 시작값을 받고
        //   사용자 입력으로 끝값을 받는다.
        //   그리고 또 다른 사용자 입력을 받는다.
        //   마지막에 입력된 사용자 입력값으로 나눠 떨어지는 숫자들을
        //   시작값과 끝값 사이에서 찾아서 출력하는 매서드를 만들어보자!
        ProcessOrder po = new ProcessOrder();

        po.setScan();
        po.setStart();
        po.setEnd();
        po.setDivNum();
        po.printOrder();
    }
}
