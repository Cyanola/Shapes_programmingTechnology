package models;

import javafx.scene.paint.Color;

public interface Creator {
    public Shape factoryMethod(String name, double x, double y, int line, Color colorborder, Color colorfill, double width, double height
    ) ;
}