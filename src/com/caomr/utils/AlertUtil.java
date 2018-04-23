package com.caomr.utils;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.util.Optional;

/**
 * Created by Caomr on 2018/4/22.
 */
public class AlertUtil {


    public static Alert alertIn(Alert.AlertType alertType, String content) {
        Alert error = new Alert(alertType, content);
        Button err = new Button();
        err.setOnAction((ActionEvent e) -> {
            Optional<ButtonType> result = error.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                error.close();
            }
        });

        return error;
    }
}
