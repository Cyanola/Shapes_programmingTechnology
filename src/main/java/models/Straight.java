package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Straight extends Shape {

    public Straight(int lineBorder, Color colorBorder, Color colorFill, double x, double y,double width, double height) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public void draw(Canvas canvas, GraphicsContext gc) {
//Start the Path

        gc.beginPath();

// Make different Paths
        gc.setStroke(this.colorBorder);

        gc.setLineWidth(this.lineBorder);

        gc.moveTo(x, y);
        Random rnd = new Random();

        double origin = canvas.maxHeight(Double.MAX_VALUE);
        double bound = canvas.maxWidth(Double.MAX_VALUE);
        gc.lineTo(rnd.nextDouble(bound) /2, rnd.nextDouble(origin)/2);


        gc.stroke();



//// End the Path

        gc.closePath();
    }
    @Override
    void setHeight(double value) {
        height = value;
    }

    @Override
    double getHeight() {
        return height;
    }

    @Override
    void setWidth(double value) {
        width = value;
    }

    @Override
    double getWidth() {
        return width;
    }

    @Override
    public String  descriptor() {
        return "Цвет границы прямой : " + super.colorBorder;     }

}