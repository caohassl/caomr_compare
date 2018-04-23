package com.caomr.controller;

import com.caomr.EventHandlers.ClearEventHandlers;
import com.caomr.EventHandlers.SeleEventHandlers;
import com.caomr.utils.AlertUtil;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    @FXML
    private TextField text_1;
    @FXML
    private TextField text_2;
    @FXML
    private TextField text_3;
    @FXML
    private TextField text_4;
    @FXML
    private TextField text_5;
    @FXML
    private TextField text_max;
    @FXML
    private Button button_clear;
    @FXML
    private Button button_commit;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SeleEventHandlers seleEventHandlers = new SeleEventHandlers(text_1,text_2,text_3,text_4,text_5,text_max);
        ClearEventHandlers clearEventHandlers = new ClearEventHandlers(text_1,text_2,text_3,text_4,text_5,text_max);
        button_commit.setOnAction(seleEventHandlers);
        button_clear.setOnAction(clearEventHandlers);
    }




}
