import java.util.List;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        List<Person> people = List.of(p1, p2);

        people.stream()
              .filter(p -> p.age() > 25)
              .forEach(System.out::println);
    }
}
