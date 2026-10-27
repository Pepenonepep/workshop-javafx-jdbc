package com.onepep.gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.onepep.App;
import com.onepep.model.entities.Department;
import com.onepep.model.services.DepartmentService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class DepartmentListController implements Initializable {
    private DepartmentService service;

    @FXML
    private Button btnNew;

    private ObservableList<Department> obsList;

    @FXML
    private TableView<Department> tableViewDepartments;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    public void onBtnNewAction() {
        System.out.println("onBtnNewAction");
    }

    public void setDepartmentService(DepartmentService service) {
        this.service = service;
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("name"));

        Stage stage = (Stage) App.getMainScene().getWindow();
        if (stage != null) {
            tableViewDepartments.prefHeightProperty().bind(stage.heightProperty());
        }
    }

    public void updateTableView() {
        if (service == null) {
            throw new IllegalStateException("Service was null");
        }
        List<Department> list = service.findAll();
        obsList = FXCollections.observableArrayList(list);
        tableViewDepartments.setItems(obsList);
    }

}
