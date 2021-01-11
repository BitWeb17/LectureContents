package Ninth;

public class Homework4 {
    public static void main(String[] args) {
        MyDice md = new MyDice(5, 3, 6);

        md.playGame();
        md.printSumOfDice();

        System.out.printf("\n정렬 후!\n\n");

        md.insertSort();
        md.printSumOfDice();
    }
}
