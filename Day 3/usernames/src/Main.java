import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    List<String> usernames= Arrays.asList("Akram","Uvaraj","Uktha","Sanjay","Unni krishnan","Aruna","Arthi");
     usernames.stream()
            .filter(names->names.startsWith("U"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

    }
}