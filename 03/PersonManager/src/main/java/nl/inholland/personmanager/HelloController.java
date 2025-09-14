package nl.inholland.personmanager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import nl.inholland.personmanager.models.Database;
import nl.inholland.personmanager.models.Person;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private Database database = new Database();
    private ObservableList<Person> people = FXCollections.observableList(database.getPeople());

    @FXML
    private TableView peopleTableView;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private DatePicker birthDate;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        peopleTableView.setItems(people);
    }

    public void onAddButtonClick() {

        String firstName = this.firstName.getText();
        String lastName = this.lastName.getText();
        LocalDate birthDate = this.birthDate.getValue();

        if(firstName.isEmpty() || lastName.isEmpty() || birthDate == null) {
            this.showAlert("Please enter all required fields.");
            return;
        }

        Person person = new Person(firstName, lastName, birthDate);
        people.add(person);

        this.firstName.clear();
        this.lastName.clear();
        this.birthDate.setValue(null);
    }

    public void onDeleteButtonClick(){
        System.out.println(this.peopleTableView.getSelectionModel().getSelectedItem());
        this.people.remove(this.peopleTableView.getSelectionModel().getSelectedItem());
    }

    public void onLogoutButtonClick() {
        try {
            HelloApplication.showLoginScene();
        } catch (IOException e) {
            showAlert("Error during logout: " + e.getMessage());
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}