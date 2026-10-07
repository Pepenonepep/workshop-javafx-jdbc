module com.onepep {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.onepep to javafx.fxml;
    exports com.onepep;
}
