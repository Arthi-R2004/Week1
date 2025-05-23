

import DOT.Employee;
import Utilities.EmployeeUtil;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(25,"Navin",25000),
                new Employee(35,"Rahul",75000),
                new Employee(42,"Ravi",34000)
        );
        List<Employee> bonusemployees= EmployeeUtil.agefilter(employees,(Employee e)->e.getAge()>30);
        bonusemployees.forEach(System.out::println);
        System.out.println("UpdatesBonusemployees:");
        List<Employee> bonusupdated=EmployeeUtil.calbonus(bonusemployees,(Employee e)->
        {e.setBonus(e.getSalary()*((double) e.getAge() /100));
            return e;});
        bonusupdated.forEach(System.out::println);
    }
}
