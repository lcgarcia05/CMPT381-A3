package com.example.drawingapp;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ColourToolbar extends StackPane {
    private Button aquaButton;
    private Button violetButton;
    private Button greenButton;
    private Button goldButton;
    private Button orangeButton;
    private Button coralButton;
    private Button fuchsiaButton;
    private Button peruButton;
    private static final int DEFAULT_SIZE = 75;

    public ColourToolbar(){
        VBox elements = new VBox();

        aquaButton = new Button("Aqua");
        violetButton = new Button("Violet");
        greenButton = new Button("Green");
        goldButton = new Button("Gold");
        orangeButton = new Button("Orange");
        coralButton = new Button("Coral");
        fuchsiaButton = new Button("Fuchsia");
        peruButton = new Button("Peru");

        // Set width
        aquaButton.setMaxWidth(Double.MAX_VALUE);
        violetButton.setMaxWidth(Double.MAX_VALUE);
        greenButton.setMaxWidth(Double.MAX_VALUE);
        goldButton.setMaxWidth(Double.MAX_VALUE);
        orangeButton.setMaxWidth(Double.MAX_VALUE);
        coralButton.setMaxWidth(Double.MAX_VALUE);
        fuchsiaButton.setMaxWidth(Double.MAX_VALUE);
        peruButton.setMaxWidth(Double.MAX_VALUE);

        // Set Height
        aquaButton.setPrefHeight(DEFAULT_SIZE);
        violetButton.setPrefHeight(DEFAULT_SIZE);
        greenButton.setPrefHeight(DEFAULT_SIZE);
        goldButton.setPrefHeight(DEFAULT_SIZE);
        orangeButton.setPrefHeight(DEFAULT_SIZE);
        coralButton.setPrefHeight(DEFAULT_SIZE);
        fuchsiaButton.setPrefHeight(DEFAULT_SIZE);
        peruButton.setPrefHeight(DEFAULT_SIZE);

        elements.setSpacing(10);
        elements.getChildren().addAll(aquaButton,violetButton,greenButton,goldButton,orangeButton,coralButton,fuchsiaButton,peruButton);
        this.getChildren().add(elements);
    }
}
