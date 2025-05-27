import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Adam", "Mia");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}
