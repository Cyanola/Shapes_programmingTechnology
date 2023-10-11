package models;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    public Circle(int lineBorder, Color colorBorder, Color colorFill, double x, double y, double width, double height) {
        super(lineBorder, colorBorder, colorFill, x, y);
        this.width=width;
        this.height=height;
    }

    @Override
    void setHeight(double value) {
        super.height = value;
    }

    @Override
    double getHeight() {
        return super.height;
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
    public void draw(Canvas canvas,GraphicsContext gr) {

        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.strokeOval(this.x - (height/2), this.y - (width/2), width, height);
        gr.setFill(colorFill);
        gr.fillOval(this.x - (height/2), this.y - (width/2), width, height);
    }

    @Override
    public  String descriptor() {
        return "Цвет заливки круга " + super.colorFill +  "а границы : " + super.colorBorder;     }
}