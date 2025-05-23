package Utilities;

import DOT.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeUtil {
    public static List<Employee> agefilter(List<Employee> employees, Predicate<Employee> codn) {
        return employees.stream().filter(codn).collect(Collectors.toList());
    }

    public static List<Employee> calbonus(List<Employee> employees, Function< Employee, Employee> bonus) {
        return employees.stream().map(bonus).collect(Collectors.toList());
    }
}