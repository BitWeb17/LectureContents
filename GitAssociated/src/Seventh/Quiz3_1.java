package Seventh;

class Triangle {
    float base;
    float height;

    float line1;
    float line2;
    float theta;

    /*
    float[] v1;
    float[] v2;

    public void setV1(float[] v1) {
        this.v1 = v1;
    }

    public void setV2(float[] v2) {
        this.v2 = v2;
    }
     */

    public void setLine1(float line1) {
        this.line1 = line1;
    }

    public void setLine2(float line2) {
        this.line2 = line2;
    }

    // 360 = 2 * pi
    //  90 = 1/2 * pi
    // theta = 2 * pi / 360 = pi / 180
    public void setTheta(float theta) {
        this.theta = theta * (float)Math.PI / 180.0f;
    }

    // return 타입이 void 이므로 반환값은 없음
    // 입력은 외부에서 들어오는 base 라는 값
    public void setBase(float base) {
        // 클래스 내부의 base 에 외부에서 들어오는 base 를 대입해서 저장
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // 밑변 * 높이 * 0.5 = 삼각형 넓이
    public float calcArea() {
        return base * height * 0.5f;
    }

    // 두 변(a, b)의 길이를 알고 그 사이 각도를 알 때 삼각형의 넓이
    // 1/2 * a * b * sin(사이각도) = 삼각형의 넓이
    public float calcArea2() {
        // 자바에서 지원하는 수학 라이브러리는 자동으로 호도법을 만들어주지 않음
        // 그러므로 우리가 직접 각도를 radian 으로 변환해야한다.
        return 0.5f * line1 * line2 * (float)Math.sin(theta);
    }
}

public class Quiz3_1 {
    public static void main(String[] args) {
        // 3) 클래스를 활용하여 삼각형의 넓이를 구하는 프로그램을 만들어보자!
        //   3-1) 밑변 * 높이 * 0.5
        //   3-2) 1/2 ab sin x
        //   3-3) 외적
        Triangle tri = new Triangle();

        // 클래스 변수(인스턴스)를 통해서 내부에 있는 매서드 호출이 가능하다.
        // 사용방법은 . 을 입력해서 내부에 접근하겠음을 알린다.
        tri.setBase(2.0f);
        tri.setHeight(3.5f);
        System.out.println("삼각형의 넓이는 = " + tri.calcArea());
    }
}
