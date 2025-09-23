package nl.inholland.fxtodoapp;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class TodoItemService {

    private List<TodoItem> items;
    private final static String FILE_NAME = "items.dat";

    public TodoItemService() {
        items = new ArrayList<>();
        items.add(new TodoItem("Test this app", false));
        items.add(new TodoItem("Just make sure it works", false));
    }

    public void save() {
        // TODO: Save items to disk
        System.out.println(items);

        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(FILE_NAME))){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (TodoItem item : items) {
                objectOutputStream.writeObject(item);
            }
        } catch (FileNotFoundException fnfe){
            System.out.println("The file wasn't found");
        } catch (IOException ioe){
            System.out.println("An IO exception occurred");
        }
    }

    public void load() {
        items = new ArrayList<>(); // initialize once at the start

        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            System.out.println("Reading todo items from file:");

            while (true) {
                try {
                    TodoItem todoItem = (TodoItem) objectInputStream.readObject();
                    System.out.println(todoItem);
                    items.add(todoItem);
                } catch (EOFException eof) {
                    // End of file reached, stop reading
                    break;
                } catch (ClassNotFoundException cnfe) {
                    System.err.println("Class definition not found: " + cnfe.getMessage());
                }
            }

        } catch (FileNotFoundException fnfe) {
            System.err.println("The file wasn't found: " + FILE_NAME);
        } catch (IOException ioe) {
            System.err.println("An I/O exception occurred: " + ioe.getMessage());
        }
    }

    public List<TodoItem> getItems() {
        return items;
    }
}
