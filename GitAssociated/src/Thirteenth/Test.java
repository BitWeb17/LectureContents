package Thirteenth;

public class Test {
    public static void main(String[] args) {
        if(3 > 5) {
            System.out.println("3이 더 크다.");
        }

        // A, B 클래스 내부에 value 값이 가정
        // A, B를 비교하고 싶은것
        // if(A.getValue() > B.getValue())
        // A, B -> C, D -> E, F -> value
        // A.getC().getTest().getValue() > B.getD().getF().getValue()
        // A.compareTo(B)
        // 핵심: 재활용
    }
}
