package com.onepep.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DepartmentListController implements Initializable {

    @FXML
    private Button btnNew;

    @FXML
    private TableView<?> tableViewDepartments;

    @FXML
    private TableColumn<?, ?> tableColumnId;

    @FXML
    private TableColumn<?, ?> tableColumnName;

    @FXML
    public void onBtnNewAction() {
        System.out.println("onBtnNewAction");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }

}
