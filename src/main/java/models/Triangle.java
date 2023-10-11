package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Triangle extends Shape {

    public Triangle(int lineBorder, Color colorBorder, Color colorFill, double x, double y,double width, double height) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public void draw(Canvas canvas,GraphicsContext gc ) {
        //Start the Path
        Random rnd = new Random();
        gc.beginPath();

// Make different Paths
        gc.setStroke(this.colorBorder);
        gc.setFill(this.colorFill);
        gc.setLineWidth(this.lineBorder);

        gc.moveTo(x, y);
        double origin = canvas.maxHeight(Double.MAX_VALUE);
        double bound = canvas.maxWidth(Double.MAX_VALUE);
        gc.lineTo(rnd.nextDouble(bound) , rnd.nextDouble(origin));

        origin = canvas.maxHeight(Double.MAX_VALUE);
        bound = canvas.maxWidth(Double.MAX_VALUE);
        gc.lineTo(rnd.nextDouble(bound) , rnd.nextDouble(origin));


        gc.lineTo(x,y);

        gc.fill();
        gc.stroke();


//// End the Path

        gc.closePath();
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
    void setHeight(double value) {
        height = value;
    }

    @Override
    double getHeight() {
        return height;
    }

    @Override
    public String descriptor() {
        return "Цвет заливки треугольника " + super.colorFill +  "а границы : " + super.colorBorder;     }

}