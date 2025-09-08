import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate, will be ignored

        // Print HashSet
        System.out.println("Fruits: " + fruits);

        // Check if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Remove an element
        // Note: find/remove is much faster in a hashset
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterate over HashSet
        System.out.println("Iterating over fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
