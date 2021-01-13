package Eleventh;

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// extends 키워드는 상속 키워드입니다.
// class Student2 extends Person2 는
// Student2 클래스에 Person2 클래스의 정보를 상속하겠다는 의미
class Student2 extends Person2 {
    private String major;

    public Student2(String name, int age, String major) {
        // super() 는 부모 클래스를 의미한다.
        // this 는 자기 자신을 의미한다.
        super(name, age);
        this.major = major;
    }

    // reference method
    public void test() {
        System.out.println(super.getName());
    }

    @Override
    public String toString() {
        // super.getName(): 부모 클래스에 있는 getName() 을 호출해주세요.
        return "Student2{" + "name='" + super.getName() +
                "', age=" + super.getAge() +
                ", major='" + major + '\'' +
                '}';
    }
}

// Q: 결국 상속을 사용하는 이유는 무엇인가 ?
// A: 짧게 쓸려고
//    메모리를 아낄려고
//    유지보수가 쉬워진다.
public class InheritanceTest {
    public static void main(String[] args) {
        Person2 p = new Person2("Tom", 33);
        System.out.println(p);

        Student2 s = new Student2(
                "Kevin", 52, "Farmer");
        System.out.println(s);
    }
}
