module com.example.restaurant_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.restaurant_project to javafx.fxml;
    exports com.example.restaurant_project;
}