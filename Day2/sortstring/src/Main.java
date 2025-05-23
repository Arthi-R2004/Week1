import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Student> stud= new ArrayList<>();
        stud.add(new Student("Mike", 10));
        stud.add(new Student("Jack", 20));
        stud.add(new Student("Akram", 30));
        stud.add(new Student("Bob", 40));

        stud.forEach(System.out::println);

        Collections.sort(stud);

        stud.forEach(System.out::println);
    }

}