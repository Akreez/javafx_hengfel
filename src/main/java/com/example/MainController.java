/*
* File: MainController.java
* Author: Kövesdi Ákos
* Copyright: 2025, Kövesdi Ákos
* Group: Szoft I-N
* Date: 2025-05-26
* Github: https://github.com/Akreez/
* Licenc: MIT
*/
package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField areaField;

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    private void startCalc(){
        if (!inputOk()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Hiba!");
            alert.setHeaderText("Hiba a bevitelben!");
            alert.setContentText("Nem megfelelő megfelelő adatok!");
            alert.initOwner(App._stage);
            alert.show();
            return;
        }
        double radius = Double.parseDouble(radiusField.getText());
        double height = Double.parseDouble(heightField.getText());

        Double area = 2*Math.PI*Math.pow(radius, 2) + 2*Math.PI*radius*height;
        
        areaField.setText(area.toString());
        clearFields();
    }

    private boolean inputOk(){
        boolean ok = false;
        if (heightField.getText().matches("[0-9]+") && radiusField.getText().matches("[0-9]+")) {
            ok = true;
        }

        return ok;
    }

    private void clearFields(){
        radiusField.setText("");
        heightField.setText("");
    }

}
