package Twelveth;

import static Twelveth.Utility.MYSTRCMP;
import static Twelveth.Utility.STRCMPTEST;

// 실질적으로 interface 에 작성한 프로토타이핑한 매서드는
// 이것을 implements 하는 클래스에서 작성해줘야 한다.
public class MyStrcmp implements Comparable {
    private double area;

    public MyStrcmp(double a) {
        area = a;
    }

    // Object ??? 이건 뭐야 ?
    // Object 는 모든 정보를 아우르고 있는 가장 거대한 집합이다.
    // 여기서 모든 정보란 ? 우리가 사용하는 모든 클래스 등등을 의미한다.
    // 그러므로 타입 캐스팅(형 변환)을 통해
    // 어떤 데이터든 Object 형태로 받을 수 있다.
    // 만약 내용을 들은 사람이 C 개발자라면 void * 생각하면 됩니다.
    public int compareTo(Object otherObj, int ORDER) {
        MyStrcmp other;

        switch (ORDER) {
            case MYSTRCMP:
                other = (MyStrcmp) otherObj;
                break;
            case STRCMPTEST:
                other = (StrcmpTest) otherObj;
                break;
            default:
                break;
        }

        if(this.area < other.area) {
            return -1;
        } else if(this.area > other.area) {
            return 1;
        } else {
            return 0;
        }
    }
}
