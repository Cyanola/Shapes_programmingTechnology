package com.example.responsibillitychain.Models;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Lava extends EnterObject{
    public Lava(int x, int y) {
        X = x; Y = y;
    }

    @Override
    public Result onEnter() {
        return Result.LAVA;
    }

    @Override
    public Shape asObj() {
        Rectangle playa = new Rectangle();
        playa.setFill(Color.DARKORANGE);
        playa.setHeight(SIZE);
        playa.setWidth(2*SIZE);
        playa.setX(X*SIZE);
        playa.setY(Y*SIZE);

        return playa;
    }

    @Override
    public String toString() {
        return "Lava";
    }
}
