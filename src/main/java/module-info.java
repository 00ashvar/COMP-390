module org.ridesharingapp.comp390ridesharingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.ridesharingapp.comp390ridesharingapp to javafx.fxml;
    exports org.ridesharingapp.comp390ridesharingapp;
}