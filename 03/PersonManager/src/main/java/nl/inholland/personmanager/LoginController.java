package nl.inholland.personmanager;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label errorLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize any required setup
        errorLabel.setVisible(false);
    }

    @FXML
    public void onLoginButtonClick() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText();

        // Clear previous error messages
        errorLabel.setVisible(false);
        errorLabel.setText("");

        // Validate input
        if (username.isEmpty() || password.isEmpty()) {
            showError("Please enter both username and password.");
            return;
        }

        // Simple authentication logic (you can replace this with your actual authentication)
        if (authenticateUser(username, password)) {
            try {
                // Navigate to the main application
                PersonApplication.showMainScene();
            } catch (IOException e) {
                showError("Error loading main application: " + e.getMessage());
            }
        } else {
            showError("Invalid username or password.");
        }
    }

    private boolean authenticateUser(String username, String password) {
        // Simple authentication logic - replace with your actual authentication mechanism
        // For demo purposes, accepting "admin" / "password" as valid credentials
        return "admin".equals(username) && "password".equals(password);
    }

    private void showError(String message) {
        errorLabel.setText(message);
        errorLabel.setVisible(true);
    }

    private void showSuccessAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
