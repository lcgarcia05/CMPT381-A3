package com.example.drawingapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DrawingApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();

        // Model
        DrawingModel model = new DrawingModel();
        InteractionModel iModel = new InteractionModel();

        // View
        MainUI mView = new MainUI();

        // Controller
        DrawingController controller = new DrawingController();


        root.getChildren().add(mView);
        Scene scene = new Scene(root);
        stage.setTitle("Drawing Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}