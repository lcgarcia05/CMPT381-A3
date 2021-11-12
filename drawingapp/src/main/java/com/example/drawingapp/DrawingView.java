package com.example.drawingapp;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class DrawingView extends StackPane {
    private Canvas myCanvas;
    private GraphicsContext gc;
    DrawingModel model;
    InteractionModel iModel;

    public DrawingView(){
        myCanvas = new Canvas(600,400);
        gc = myCanvas.getGraphicsContext2D();
        this.getChildren().add(myCanvas);
    }
}
