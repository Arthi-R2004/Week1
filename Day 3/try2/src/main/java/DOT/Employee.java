package DOT;

public class Employee {
    private int age;
    private String name;
    private double salary;
    private double bonus;

    public Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public double getSalary() { return salary; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setBonus(double n) { bonus=n; }

    @Override
    public String toString() {
        return name + " - " + age + " -" + salary + " - " + bonus;
    }
}
