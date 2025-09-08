import java.util.Set;
import java.util.TreeSet;
import model.Person;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Alice"));
        people.add(new Person("Bob"));
        people.add(new Person("Alice")); // duplicate based on compareTo()

        System.out.println(people); // [Alice, Bob]
    }
}