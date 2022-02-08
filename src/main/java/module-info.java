module com.example.taskmanagertrythree {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taskmanagertrythree to javafx.fxml;
    exports com.example.taskmanagertrythree;
}