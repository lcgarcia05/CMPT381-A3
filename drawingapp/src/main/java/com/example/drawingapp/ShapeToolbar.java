package com.example.drawingapp;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ShapeToolbar extends StackPane {
    private Button rectangleButton;
    private Button squareButton;
    private Button circleButton;
    private Button ovalButton;
    private Button lineButton;
    private static final int DEFAULT_SIZE = 100;


    public ShapeToolbar() {
        VBox elements = new VBox();
        rectangleButton = new Button("Rectangle");
        squareButton = new Button("Square");
        circleButton = new Button("Circle");
        ovalButton = new Button("Oval");
        lineButton = new Button("Line");

        // Set width
        rectangleButton.setMaxWidth(Double.MAX_VALUE);
        squareButton.setMaxWidth(Double.MAX_VALUE);
        circleButton.setMaxWidth(Double.MAX_VALUE);
        ovalButton.setMaxWidth(Double.MAX_VALUE);
        lineButton.setMaxWidth(Double.MAX_VALUE);

        // Set Height
        rectangleButton.setPrefHeight(DEFAULT_SIZE);
        squareButton.setPrefHeight(DEFAULT_SIZE);
        circleButton.setPrefHeight(DEFAULT_SIZE);
        ovalButton.setPrefHeight(DEFAULT_SIZE);
        lineButton.setPrefHeight(DEFAULT_SIZE);


        elements.getChildren().addAll(rectangleButton,squareButton,circleButton,ovalButton,lineButton);
        this.getChildren().add(elements);
    }
}
