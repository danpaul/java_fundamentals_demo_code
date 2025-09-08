package model;

/**
 * Here we must implement the `compareTo` method so that we can use this class in
 *  the _sorted_ TreeSet.
 *
 * Note: Comparable is a _generic_ interface.
 */
public class Person implements Comparable<Person> {
    String name;
    public Person(String name) { this.name = name; }


    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.name); // alphabetical order
    }

    @Override
    public String toString() { return name; }
}
