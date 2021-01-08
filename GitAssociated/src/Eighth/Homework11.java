package Eighth;

public class Homework11 {
    public static void main(String[] args) {
        // 11) 이 배열에서 짝수가 몇 개 나왔는지 체크하는 매서드를 만든다.
        RandomAlloc ra = new RandomAlloc();

        ra.prepareArray();
        ra.setRandomArray();
        ra.printEmployee();

        System.out.println("");
        System.out.println(
                "짝수의 개수는 = " + ra.getArrayEvenNumberCount());
    }
}
