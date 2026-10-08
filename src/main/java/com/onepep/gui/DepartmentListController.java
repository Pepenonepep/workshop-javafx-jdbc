package com.onepep.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.onepep.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage = (Stage) App.getMainScene().getWindow();
        tableViewDepartments.prefHeightProperty().bind(stage.heightProperty());

    }

}
