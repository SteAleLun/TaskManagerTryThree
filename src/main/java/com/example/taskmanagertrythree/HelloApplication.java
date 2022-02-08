package com.example.taskmanagertrythree;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        HelloController helloController = new HelloController(primaryStage);
        helloController.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}