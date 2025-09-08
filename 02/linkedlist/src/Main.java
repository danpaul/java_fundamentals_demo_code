import model.MyLinkedList;
import model.Node;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.printList(); // 10 -> 20 -> 30 -> null

        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("Alice");
        stringList.add("Bob");
        stringList.printList(); // Alice -> Bob -> null

        System.out.println(intList.contains(20));   // true
        intList.remove(20);
        intList.printList(); // 10 -> 30 -> null
    }
}