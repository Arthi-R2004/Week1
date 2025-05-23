import static java.lang.CharSequence.compare;

public class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public int compareTo(Student that) {
        return compare(this.name, that.name);
    }

    public String toString() {
        return name + " " + age;
    }
}

