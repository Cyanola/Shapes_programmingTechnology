package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    //параметры фигуры - приватные поля

    protected double lineBorder;
    protected Color colorBorder;
    protected Color colorFill;
    protected double x, y;
    protected double x1, y1;
    protected double x2, y2;

    public double height;

    abstract void SetHeight(double value);

    abstract double GetHeight();

    // объявление абстрактных методов

    abstract double area();

    public abstract void draw(GraphicsContext gr, Canvas canvas);

    public abstract void drawHand(GraphicsContext gr);

    // конструктор

    public Shape(Color colorBorder, Color colorFill, double lineBorder, double x, double y) {

        System.out.println("Shape constructor called");

        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
        this.lineBorder = lineBorder;
        this.x = x;
        this.y = y;
    }

    // реализация методов

    public Color getColorBorder() {

        return this.colorBorder;
    }


    public void setColorBorder(Color color) {

        this.colorBorder = color;
    }


    public Color getColorFill() {

        return this.colorFill;
    }


    public void setColorFill(Color color) {

        this.colorFill = color;
    }

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

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}