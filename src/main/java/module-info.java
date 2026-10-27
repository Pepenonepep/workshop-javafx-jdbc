module com.onepep {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.onepep to javafx.fxml;
    opens com.onepep.gui to javafx.fxml;
    opens com.onepep.gui.util to javafx.fxml;
    opens com.onepep.model.entities to javafx.base;

    exports com.onepep;
    exports com.onepep.gui;
    exports com.onepep.model.entities;
    exports com.onepep.model.services;
    exports com.onepep.model.dao;
    exports com.onepep.db;
}
