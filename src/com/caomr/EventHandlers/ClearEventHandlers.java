package com.caomr.EventHandlers;

import com.caomr.utils.AlertUtil;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by icourt1 on 2018/4/23.
 */
public class ClearEventHandlers implements EventHandler {
    private TextField text_1;
    private TextField text_2;
    private TextField text_3;
    private TextField text_4;
    private TextField text_5;
    private TextField text_max;

    public ClearEventHandlers(TextField text_1,TextField text_2,TextField text_3,TextField text_4,TextField text_5,TextField text_max){
        this.text_1 = text_1;
        this.text_2 = text_2;
        this.text_3 = text_3;
        this.text_4 = text_4;
        this.text_5 = text_5;
        this.text_max = text_max;
    }

    @Override
    public void handle(Event event) {
        text_1.setText("");
        text_2.setText("");
        text_3.setText("");
        text_4.setText("");
        text_5.setText("");
        text_max.setText("");
    }
}
