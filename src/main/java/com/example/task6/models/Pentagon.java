package com.example.task6.models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pentagon extends Shape {
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
    public Pentagon(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public String descriptor() {
        return "Пятиугольник"+" " + super.getX()+" "+super.getY()+" "+super.getLineBorder()+" "+super.getColorBorder().toString()+" "+super.getColorFill().toString();
    }
    public Pentagon(){
        super();
        type = "Пятиугольник";
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
    public void draw(Canvas canvas, GraphicsContext gr,double x, double y, int Borderline, Color Border, Color Fill) {
        setColorBorder(Border);
        setColorFill(Fill);
        setLineBorder(Borderline);
        setXY(x,y);
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.setFill(colorFill);
        gr.strokePolygon(new double[]{this.x,this.x/2,this.x/1.5, this.x*1.5,this.x*2},
                new double[]{this.y,this.y*1.5, this.y*2, this.y*2,this.y*1.5},5
        );

        gr.setFill(colorFill);
        gr.fillPolygon(new double[]{this.x,this.x/2,this.x/1.5, this.x*1.5,this.x*2},
                new double[]{this.y,this.y*1.5, this.y*2, this.y*2,this.y*1.5},5
        );

    }
    @Override
    public String toString()
    {
       return "Пятиугольник";
    }
}