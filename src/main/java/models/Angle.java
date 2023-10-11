package models;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends Shape {

    public Angle(double x, double y, int lineBorder, Color colorBorder, Color colorFill,double width, double height) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public void draw(Canvas canvas, GraphicsContext gr) {
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);

        gr.strokePolygon(new double[]{x, x*2},
                new double[]{y,y},2
        );
        gr.strokePolygon(new double[]{x+x, x+x},
                new double[]{y,x*2},2
        );
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
        return "Цвет границы угла: " + super.colorBorder;     }
}
