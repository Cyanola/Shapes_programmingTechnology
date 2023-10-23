package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pentagon extends Shape {
    public Pentagon(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public String descriptor() {
        return "Цвет заливки пятиугольника " + super.colorFill +  "а границы : " + super.colorBorder;     }

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
    public void draw(Canvas canvas, GraphicsContext gr) {
        gr.setStroke(colorBorder);

        gr.setLineWidth(lineBorder);


        gr.strokePolygon(new double[]{x,x/2,x/1.5, x*1.5,x*2},
                new double[]{y,y*1.5, y*2, y*2,y*1.5},5
        );

        gr.setFill(colorFill);
        gr.fillPolygon(new double[]{x,x/2,x/1.5, x*1.5,x*2},
                new double[]{y,y*1.5, y*2, y*2,y*1.5},5
        );

    }
    @Override
    public String toString()
    {
        return "Пятиугольник"+" " + super.getX()+" "+super.getY()+" "+super.getLineBorder()+" "+super.getColorBorder().toString()+" "+super.getColorFill().toString();
    }
}