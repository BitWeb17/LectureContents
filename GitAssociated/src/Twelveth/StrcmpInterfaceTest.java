package Twelveth;

import static Twelveth.Utility.MYSTRCMP;
import static Twelveth.Utility.STRCMPTEST;

// String compare with Interface
public class StrcmpInterfaceTest {
    public static void main(String[] args) {
        MyStrcmp ms1 = new MyStrcmp(105.3);
        MyStrcmp ms2 = new MyStrcmp(105.3);

        StrcmpTest st = new StrcmpTest(105.3);

        // 뭐야 ? 왜 MyStrcmp 를 구지 Object 로 바꾸고
        // 다시 이것을 형변환해서 MyStrcmp 로 만들었지 ?
        if(ms1.compareTo(ms2, MYSTRCMP) > 0) {
            System.out.println("ms1이 ms2 보다 더 크다.");
        } else if(ms1.compareTo(ms2, MYSTRCMP) < 0) {
            System.out.println("ms1은 ms2 보다 더 작다.");
        } else {
            System.out.println("ms1과 ms2는 같다.");
        }

        if(ms1.compareTo(st, STRCMPTEST) == 0) {
            System.out.println("이게 되네 ?");
        }
    }
}
