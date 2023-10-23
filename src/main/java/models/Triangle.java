package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Triangle extends Shape {

    public Triangle(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
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

        gc.lineTo(x-50 , y+100);

        gc.lineTo(x+50 , y+100);


        gc.lineTo(x,y);

        gc.fill();
        gc.stroke();


//// End the Path

        gc.closePath();
    }
    @Override
    public String toString()
    {
        return "Треугольник" + " "+super.getX()+" "+super.getY()+" "+super.getLineBorder()+" "+super.getColorBorder().toString()+" "+super.getColorFill().toString();
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