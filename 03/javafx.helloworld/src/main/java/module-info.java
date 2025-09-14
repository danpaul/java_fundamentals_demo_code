module org.example.javafx_helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx_helloworld to javafx.fxml;
    exports org.example.javafx_helloworld;
}