package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Triangle extends Shape {



    public Triangle(Color colorBorder, Color ColorFill, double lineBorder, double x, double y) {
        super(colorBorder, ColorFill, lineBorder, x, y);

    }

    @Override
    void SetHeight(double value)
    {
        this.height = 2 * area()/(value);

    }

    @Override
    double GetHeight() {
        return height;
    }


    //по формуле герона
    @Override
    double area() {

        return 1.0/2*Math.abs((x1-x)*(y2-y)-(x2-x)*(y1-y));
    }


    @Override

    public void drawHand(GraphicsContext gc)
    {
//Start the Path

        gc.beginPath();

// Make different Paths
        gc.setStroke(this.colorBorder);
        gc.setFill(this.colorFill);
        gc.setLineWidth(this.lineBorder);

        gc.moveTo(x, y);
        gc.lineTo(this.x1, this.y1);

        gc.lineTo(this.x2,this.y2);


        gc.lineTo(x,y);

        gc.fill();
        gc.stroke();



//// End the Path

        gc.closePath();
    }
    @Override
    public String toString() {

        return "Цвет заливки треугольника " + super.colorFill +  "а площадь : " + area();   }


    @Override
    public void draw(GraphicsContext gc, Canvas canvas)
    {
        Random rnd = new Random();

        double origin = canvas.minWidth(Double.MIN_VALUE);
        double bound = canvas.maxWidth(Double.MAX_VALUE);


        setX1(   rnd.nextDouble(bound));

        bound = canvas.maxHeight(Double.MAX_VALUE);


        setY1(  rnd.nextDouble(bound));
        bound =  canvas.maxWidth(Double.MAX_VALUE);


        setX2(  rnd.nextDouble( bound));

        bound = canvas.maxHeight(Double.MAX_VALUE);


        setY2(  rnd.nextDouble( bound));

        gc.setLineWidth(lineBorder);
        gc.setStroke(colorBorder);
        gc.strokeLine(x,y,x1,y1);
        gc.strokeLine(x1,y1,x2,y2);
        gc.strokeLine(x2,y2,x,y);
        gc.setFill(colorFill);

        gc.fillPolygon(new double[]{x, x1, x2}, new double[]{y, y1, y2}, 3);
    }
}