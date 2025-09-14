module nl.inholland.personmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens nl.inholland.personmanager to javafx.fxml;
    opens nl.inholland.personmanager.models to javafx.base;
    exports nl.inholland.personmanager;
}