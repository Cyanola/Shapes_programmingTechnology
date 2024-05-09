package com.example.responsibillitychain.Models;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Ground extends EnterObject{
    public Ground(int x, int y) {
        X = x; Y = y;
    }

    @Override
    public Result onEnter() {
        return Result.GROUND;
    }

    @Override
    public Shape asObj() {
        Rectangle playa = new Rectangle();
        playa.setFill(Color.BROWN);
        playa.setHeight(SIZE);
        playa.setWidth(2*SIZE);
        playa.setX(X*SIZE);
        playa.setY(Y*SIZE);

        return playa;
    }

    @Override
    public String toString() {
        return "Ground";
    }
}
