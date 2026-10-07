module com.onepep {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.onepep to javafx.fxml;
    opens com.onepep.gui to javafx.fxml;
    exports com.onepep;
    exports com.onepep.gui;
}
