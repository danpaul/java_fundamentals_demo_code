package nl.inholland.fxtodoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class TodoApplication extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        showTodoScreen("");
    }

    public static void showTodoScreen(String selectedFile) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(TodoApplication.class.getResource("todo-view.fxml"));

        TodoController todoController = new TodoController(selectedFile);
        fxmlLoader.setController(todoController);

        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("TODO application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void selectFile() {
        try {
            // FileChooser = new FileChooser();
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select a data file");

            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                showTodoScreen(selectedFile.getAbsolutePath());
            } else {
                showTodoScreen("");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}