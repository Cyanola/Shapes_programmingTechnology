package com.example.task6.models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Straight extends Shape {
    @Override
    public void setXY(double x, double y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public void setLineBorder(int lineBorder) {
        this.lineBorder = lineBorder;
    }
    @Override
    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }
    @Override
    public void setColorFill(Color colorFill) {
        this.colorFill = colorFill;
    }
    public Straight(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }
    @Override
    public String toString()
    {
      return "Прямая";
    }
    @Override
    public void draw(Canvas canvas, GraphicsContext gc,double x, double y, int Borderline, Color Border, Color Fill) {
//Start the Path

        gc.beginPath();

// Make different Paths
        setColorBorder(Border);
        setColorFill(Fill);
        setLineBorder(Borderline);
        setXY(x,y);
        gc.setStroke(colorBorder);
        gc.setLineWidth(lineBorder);


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
    public Straight(){
        super();
        type = "Прямая";
    }
    @Override
    public String  descriptor() {
        return "Прямая" +" " + super.getX()+" "+super.getY()+" "+super.getLineBorder()+" "+super.getColorBorder().toString()+" "+super.getColorFill().toString();
    }

}