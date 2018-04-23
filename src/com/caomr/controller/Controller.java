package com.caomr.controller;

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

    Double num1;
    Double num2;
    Double num3;
    Double num4;
    Double num5;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button_commit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    checkNum();
                } catch (Exception e) {
                    e.printStackTrace();
                    AlertUtil.alertIn(Alert.AlertType.ERROR, e.getMessage()).show();
                }
                List<String> numberList = new ArrayList<>();
                numberList.add("第一个数 " + num1);
                numberList.add("第二个数 " + num2);
                numberList.add("第三个数 " + num3);
                numberList.add("第四个数 " + num4);
                numberList.add("第五个数 " + num5);
                Collections.sort(numberList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        Double o1 = Double.parseDouble(s1.split(" ")[1]);
                        Double o2 = Double.parseDouble(s2.split(" ")[1]);
                        return o2 - o1 > 0 ? 1 : o2 - o1 == 0 ? 0 : -1;
                    }
                });
                StringBuilder sb = geneRet(numberList);
                text_max.setText(sb.toString());
            }
        });
        button_clear.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                text_1.setText("");
                text_2.setText("");
                text_3.setText("");
                text_4.setText("");
                text_5.setText("");
                text_max.setText("");
            }
        });
    }

    private StringBuilder geneRet(List<String> numberList) {
        int i = 0;
        Double o1 = Double.parseDouble(numberList.get(0).split(" ")[1]);
        for (int j = 1; j < numberList.size(); j++) {
            Double o2 = Double.parseDouble(numberList.get(j).split(" ")[1]);
            if (o2.equals(o1) ) {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("最大值为");
        for (int j = 0; j <= i; j++) {
            sb.append(numberList.get(j) + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
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
