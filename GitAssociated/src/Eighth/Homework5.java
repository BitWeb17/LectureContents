package Eighth;

public class Homework5 {
    public static void main(String[] args) {
        // 5) 3 ~ 33 까지의 숫자중 2 의 배수 또는 3 의 배수인 수를 출력해보자!
        MySeries ms = new MySeries();

        ms.printTwiceOrder(3, 33,
                2, 3, ms.OR);
    }
}
