package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



public abstract class Shape {

    protected int lineBorder;
    protected Color colorBorder;
    protected Color colorFill;
    protected double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Shape(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        this.lineBorder = lineBorder;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
        this.x = x;
        this.y = y;
    }
    public double height;
    public double width;
    abstract void setHeight(double value);
    abstract double getHeight();
    abstract void setWidth(double value);
    abstract double getWidth();

    public abstract void draw(Canvas canvas,  GraphicsContext gr);
    public abstract String descriptor();


    public double getLineBorder() {
        return lineBorder;
    }

    public void setLineBorder(int lineBorder) {
        this.lineBorder = lineBorder;
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public Color getColorFill() {
        return colorFill;
    }

    public void setColorFill(Color colorFill) {
        this.colorFill = colorFill;
    }


}