package nl.inholland.personmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonApplication extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        showLoginScene();
    }

    public static void showLoginScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PersonApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(PersonApplication.class.getResource("style.css").toExternalForm());

        primaryStage.setTitle("Login - People Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showMainScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PersonApplication.class.getResource("hello-view.fxml"));

        // Manually create and set controller
        PersonController controller = new PersonController();
        fxmlLoader.setController(controller);

        // Load FXML after setting controller
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(PersonApplication.class.getResource("style.css").toExternalForm());

        primaryStage.setTitle("People Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

