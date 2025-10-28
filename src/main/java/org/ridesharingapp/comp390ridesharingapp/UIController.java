package org.ridesharingapp.comp390ridesharingapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UIController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onPressMeButtonClick() {
        welcomeText.setText("Welcome to RideShare Application!");
    }
}