public class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return ("Name: " + name+" Age: " + age);
    }
}


