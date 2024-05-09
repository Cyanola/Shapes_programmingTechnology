package com.example.responsibillitychain.Models;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Redstone extends EnterObject{
    public Redstone(int x, int y) {
        X = x; Y = y;
    }
    @Override
    public Result onEnter()
    {
        return Result.REDSTONE;
    }
    @Override
    public Shape asObj()
    {
        Circle obj = new Circle();
        obj.setRadius(SIZE/2);
        obj.setFill(Color.RED);
        obj.setCenterX(X*SIZE+(SIZE/2));
        obj.setCenterY(Y*SIZE+(SIZE/2));
        return obj;
    }

    @Override
    public String toString() {
        return "Redstone";
    }
}
