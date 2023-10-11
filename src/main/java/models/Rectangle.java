package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {

    double length;


    @Override
    void SetHeight(double value) {
        height = value;
    }

    @Override
    double GetHeight() {
        return height;
    }

    @Override
    public double area(){
        return this.length*height;
    }

    public Rectangle(Color colorBorder, Color ColorFill, double x, double y, double lineBorder,
                     double length, double height) {
        super(colorBorder, ColorFill, lineBorder, x, y);
        this.length=length;
        this.height=height;
    }

    void setLength(double value) {length = value;}
    double getLength() {return length;}
    @Override
    public String toString() {

        return "Цвет заливки прямоугольника " + super.colorFill +  "а площадь : " + area();     }

    @Override
    public void draw(GraphicsContext gr, Canvas canvas) {
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.strokeRect(x, y, length, height);
        gr.setFill(colorFill);
        gr.fillRect(x, y, length, height);
    }

    @Override
    public void drawHand(GraphicsContext gr) {

    }
}