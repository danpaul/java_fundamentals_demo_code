package nl.inholland.personmanager.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Person> people = new ArrayList<Person>();

    public Database() {
        people.add(new Person("Michiel", "Romeyn", LocalDate.of(1970, 04, 20)));
        people.add(new Person("Piet", "de Vries", LocalDate.of(1970, 04, 20)));
    }

    public List<Person> getPeople() {
        return people;
    }
}
