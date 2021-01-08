package Eighth;

public class Homework2 {
    public static void main(String[] args) {
        // 2) 1 ~ 10 까지의 숫자를 더한 결과를 출력하도록 매서드를 만들어보자!
        MySeries ms = new MySeries();

        System.out.println(
                "1 ~ 10 까지의 합 = " + ms.valueSum(1, 10));
    }
}
