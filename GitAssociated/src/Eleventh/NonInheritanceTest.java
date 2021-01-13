package Eleventh;

class Student {
    String name;
    int age;
    String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class NonInheritanceTest {
    public static void main(String[] args) {
        Person p = new Person("John", 20);
        System.out.println(p);

        Student s = new Student(
                "David", 21, "Art");
        System.out.println(s);
    }
}
