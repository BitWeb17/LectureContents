package Eighth;

public class Homework8 {
    public static void main(String[] args) {
        // 8) 7번 문제를 중복이 허용되지 않도록 만든다.
        RandomAlloc ra = new RandomAlloc();

        ra.prepareEmployee(20);
        ra.setRandomNumber(ra.NONDUPLICATE);
        ra.printEmployee();
    }
}
