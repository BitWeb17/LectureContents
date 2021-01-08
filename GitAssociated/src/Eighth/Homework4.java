package Eighth;

public class Homework4 {
    public static void main(String[] args) {
        // 4) 1 ~ 20 까지의 숫자중 2 의 배수이고 3 의 배수인 수를 출력해보자!
        MySeries ms = new MySeries();

        ms.printTwiceOrder(1, 20,
                2, 3, ms.AND);
    }
}
