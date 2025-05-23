import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<List<Employee>> employeeSupplier = () -> Arrays.asList(
                new Employee(25, "Navin", 25000),
                new Employee(35, "Rahul", 75000),
                new Employee(42, "Ravi", 34000)
        );

        List<Employee> employees = employeeSupplier.get();

        Consumer<Employee> displayEmployee = e -> System.out.println(e);

        List<Employee> bonusEligibleEmployees = EmployeeUtil.agefilter(employees, e -> e.getAge() > 30);

        System.out.println("Filtered Employees:");
        bonusEligibleEmployees.forEach(displayEmployee);

        List<Employee> bonusUpdatedEmployees = EmployeeUtil.calbonus(bonusEligibleEmployees, e -> {
            e.setBonus(e.getSalary() * e.getAge() / 100.0);
            return e;
        });

        System.out.println("Updated Bonus Employees:");
        bonusUpdatedEmployees.forEach(displayEmployee);
    }
}
