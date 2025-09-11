import model.Employee;
import model.Freelancer;
import model.interfaces.Payable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // type of ArrayList is `Payable` so, it can contain any class that
        //  implements the `Payable` interface
        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(new Employee(500000));
        payables.add(new Freelancer(40, 50));

        for (Payable payable : payables) {
            payable.printInfo();
        }
    }
}