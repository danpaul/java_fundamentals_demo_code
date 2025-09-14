package nl.inholland.personmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        showLoginScene();
    }

    public static void showLoginScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(HelloApplication.class.getResource("style.css").toExternalForm());

        primaryStage.setTitle("Login - People Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showMainScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Manually create and set controller
        HelloController controller = new HelloController();
        fxmlLoader.setController(controller);

        // Load FXML after setting controller
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(HelloApplication.class.getResource("style.css").toExternalForm());

        primaryStage.setTitle("People Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}