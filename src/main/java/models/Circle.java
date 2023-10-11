package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

    public Circle(Color colorBorder, Color ColorFill, double x, double y, double lineBorder, double height, double width) {
        super(colorBorder, ColorFill, lineBorder, x, y);
        this.height = height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double width;
    @Override
    void SetHeight(double value) {
        height = value;
    }

    @Override
    double GetHeight() {
        return height;
    }

    @Override public double area()
    {
        return Math.PI* height/2 *width/2;
    }
    @Override
    public void draw(GraphicsContext gr, Canvas canvas)
    {
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.strokeOval(x, y, width, height);
        gr.setFill(colorFill);
        gr.fillOval(x, y, width, height);
    }

    @Override
    public void drawHand(GraphicsContext gr) {

    }
    @Override
    public String toString() {

        return "Цвет заливки круга " + super.colorFill +  "а площадь : " + area();     }


}