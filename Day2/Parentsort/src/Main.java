import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Parent> parents = new ArrayList<>();
        parents.add(new Parent("Lavan",45));
        parents.add(new Parent("Priya",23));
        parents.add(new Parent("Ashok",51));

        parents.forEach(System.out::println);
        Collections.sort(parents, new Parentsort());
        System.out.println("\nSorted by Parent Name");
        parents.forEach(System.out::println);
    }
}