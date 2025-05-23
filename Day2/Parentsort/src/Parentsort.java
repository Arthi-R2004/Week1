import java.util.Comparator;

class Parentsort implements Comparator<Parent> {
    public int compare(Parent p1, Parent p2) {
        return p2.name.compareTo(p1.name);
    }
}