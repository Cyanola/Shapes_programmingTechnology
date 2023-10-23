package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    public Square(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        super(lineBorder, colorBorder, colorFill, x, y);
        this.width = 35;
        this.height=35;
    }

    @Override
    public void draw(Canvas canvas, GraphicsContext gr) {
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);

        gr.strokeRect(this.x - (width/2), this.y - (height/2), width, height);
        gr.setFill(colorFill);
        gr.fillRect(this.x - (width/2), this.y - (height/2), width, height);
    }
//
    @Override
    public String toString()
    {
        return "Квадрат" +" " + super.getX()+" "+super.getY()+" "+super.getLineBorder()+" "+super.getColorBorder().toString()+" "+super.getColorFill().toString();
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
    public String descriptor() {
        return "Цвет заливки квадрата " + super.colorFill +  "а границы : " + super.colorBorder;     }
}
