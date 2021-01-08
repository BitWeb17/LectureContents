package Eighth;

public class Homework9 {
    public static void main(String[] args) {
        // 9) 8번 문제에서 번호별로 상금과 꽝이 존재하도록 하여
        //    당첨되면 '상금을 xxx 받았습니다.'
        //    꽝이면 '아쉽네요 ~ 다음에 재도전을!' 이 출력되도록 만든다.
        // 규칙: 꽝 - 짝수
        //      7의 배수 - 1000만원
        //      3의 배수 - 100만원
        RandomAlloc ra = new RandomAlloc();

        ra.prepareEmployee(20);
        ra.setRandomNumber(ra.NONDUPLICATE);
        ra.printEmployee();

        ra.printPrice();
    }
}
