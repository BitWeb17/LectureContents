package Eighth;

public class Homework7 {
    public static void main(String[] args) {
        // 7) 총 20명의 사원이 있다고 가정한다.
        //    20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 허용)
        RandomAlloc ra = new RandomAlloc();

        ra.prepareEmployee(20);
        ra.setRandomNumber(ra.DUPLICATE);
        ra.printEmployee();
    }
}
