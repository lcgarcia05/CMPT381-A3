package com.example.drawingapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MainUI extends StackPane implements DrawingModelSubscriber{
    private ShapeToolbar shapeToolbar;
    private ColourToolbar colourToolbar;
    private DrawingView drawingView;

    public MainUI(){
        HBox ele = new HBox();
        shapeToolbar = new ShapeToolbar();
        drawingView = new DrawingView();
        colourToolbar = new ColourToolbar();

        colourToolbar.setPrefHeight(shapeToolbar.getHeight());
        ele.getChildren().addAll(shapeToolbar, drawingView, colourToolbar);
        this.getChildren().add(ele);
    }


    @Override
    public void modelChanged() {

    }
}
