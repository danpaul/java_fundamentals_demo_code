import model.Person;
import model.Student;
import model.Teacher;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating a new mixed-array containing classes that derive form the Person super class
        Person[] people = {
                new Teacher("Teacher1", "teacher1@email.com", 2000),
                new Teacher("Teacher2", "teacher2@email.com", 3000),
                new Student("Student1", "student1@email.com", "A"),
                new Student("Student2", "student2@email.com", "B")
        };

        System.out.println("********** Info about people: *********");
        for (Person person : people) {
            person.printInfo();
        }

        System.out.println("\n********** Print only teacher info: *********");
        for (Person person : people) {
            // determine the classes type at runtime
            if (person.getClass() == Teacher.class) {
                Teacher teacher = (Teacher) person;
                ((Teacher) person).getYearlySalary();
                person.printInfo();
                // person.getYearlSalary();
            }
        }
    }
}