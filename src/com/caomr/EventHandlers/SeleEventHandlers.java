package com.caomr.EventHandlers;

import com.caomr.SeviceImpl.SeleMaxServiceImpl;
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
public class SeleEventHandlers implements EventHandler {
    private TextField text_1;
    private TextField text_2;
    private TextField text_3;
    private TextField text_4;
    private TextField text_5;
    private TextField text_max;

    Double num1;
    Double num2;
    Double num3;
    Double num4;
    Double num5;

    SeleMaxServiceImpl seleMaxServiceImpl = new SeleMaxServiceImpl();

    public SeleEventHandlers(TextField text_1,TextField text_2,TextField text_3,TextField text_4,TextField text_5,TextField text_max){
        this.text_1 = text_1;
        this.text_2 = text_2;
        this.text_3 = text_3;
        this.text_4 = text_4;
        this.text_5 = text_5;
        this.text_max = text_max;
    }




    @Override
    public void handle(Event event) {
        try {
            checkNum();
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtil.alertIn(Alert.AlertType.ERROR, e.getMessage()).show();
        }
        List numberList = seleMaxServiceImpl.genList(num1,num2,num3,num4,num5);
        StringBuilder sb = seleMaxServiceImpl.geneRet(numberList);
        text_max.setText(sb.toString());
    }

    private void checkNum() throws Exception {
        try {
            if (null == text_1.getText() || "".equals(text_1.getText())) {
                num1 = 0d;
            } else {
                num1 = Double.parseDouble(text_1.getText());
            }
        } catch (Exception e) {
            throw new Exception("第一个数字输入有误");
        }
        try {
            if (null == text_2.getText() || "".equals(text_2.getText())) {
                num2 = 0d;
            } else{
                num2 = Double.parseDouble(text_2.getText());
            }
        } catch (Exception e) {
            throw new Exception("第二个数字输入有误");
        }
        try {
            if (null == text_3.getText() || "".equals(text_3.getText())) {
                num3 = 0d;
            }else {
                num3 = Double.parseDouble(text_3.getText());
            }
        } catch (Exception e) {
            throw new Exception("第三个数字输入有误");
        }
        try {
            if (null == text_4.getText() || "".equals(text_4.getText())) {
                num4 = 0d;
            }else {
                num4 = Double.parseDouble(text_4.getText());
            }
        } catch (Exception e) {
            throw new Exception("第四个数字输入有误");
        }
        try {
            if (null == text_5.getText() || "".equals(text_5.getText())) {
                num5 = 0d;
            }else {
                num5 = Double.parseDouble(text_5.getText());
            }
        } catch (Exception e) {
            throw new Exception("第五个数字输入有误");
        }
    }
}
