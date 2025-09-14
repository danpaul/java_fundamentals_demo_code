module org.example.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxlogin to javafx.fxml;
    exports org.example.javafxlogin;
}