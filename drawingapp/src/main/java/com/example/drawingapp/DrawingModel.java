package com.example.drawingapp;

import java.util.ArrayList;

public class DrawingModel {
    private ArrayList<DrawingModelSubscriber> subscribers;

    public DrawingModel(){

    }

    public void addSubscriber(DrawingModelSubscriber aSub){
        subscribers.add(aSub);
    }

    private void notifySubscriber(){
        subscribers.forEach(sub -> sub.modelChanged());
    }

}
