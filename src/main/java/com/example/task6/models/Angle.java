package com.example.task6.models;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends Shape {

    public Angle(double x, double y, int lineBorder, Color colorBorder, Color colorFill) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public void draw(Canvas canvas, GraphicsContext gr,double x, double y, int Borderline, Color Border, Color Fill) {
       setColorBorder(Border);
       setColorFill(Fill);
       setLineBorder(Borderline);
       setXY(x,y);
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);

        gr.strokePolygon(new double[]{this.x, this
                        .x*2},
                new double[]{this.y,this
                        .y},2
        );
        gr.strokePolygon(new double[]{this.x+this.x, this.x+this.x},
                new double[]{this.y,this.x*2},2
        );
    }

    @Override
    public void setXY(double x, double y) {
        this.x=x;
        this.y=y;
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
    public  String  descriptor() {

        return "Угол" +" "+ super.getX()+" "+super.getY()+" "+super.getLineBorder()+" "+super.getColorBorder().toString()+" "+super.getColorFill().toString();}

public Angle(){
    super();
type = "Угол";
}
    @Override
    public String toString()
    {
        return "Угол";
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
}
