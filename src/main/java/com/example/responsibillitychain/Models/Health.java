package com.example.responsibillitychain.Models;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Health extends EnterObject {
    public Health(int x, int y) {
        X = x; Y = y;
    }

    @Override
    public Result onEnter() {
   return Result.HEALTH;
    }

    @Override
    public String toString() {
        return "Health";
    }

    @Override
    public Shape asObj() {
        Rectangle playa = new Rectangle();
        playa.setFill(Color.GREEN);
        playa.setHeight(SIZE);
        playa.setWidth(2*SIZE);
        playa.setX(X*SIZE);
        playa.setY(Y*SIZE);

        return playa;
    }
}
