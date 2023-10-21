package Factory;

import javafx.scene.paint.Color;

import models.* ;


import java.util.HashMap;
import java.util.Objects;


public class ShapeFactory implements Creator {

    public ShapeFactory(double x, double y, int line, Color colorborder, Color colorfill, double width, double height){
        shapes.put("Квадрат", new Square(line, colorborder, colorfill, x, y, width, height));
        shapes.put("Пятиугольник", new Pentagon(line, colorborder, colorfill, x, y,0,0));
        shapes.put("Треугольник", new Triangle(line, colorborder, colorfill, x, y,0,0));
        shapes.put("Угол", new Angle(x,y,line, colorborder, colorfill,0,0));
        shapes.put("Прямая", new Straight(line, colorborder, colorfill, x, y,0,0));
        shapes.put("Круг", new Circle(line, colorborder, colorfill, x, y, width, height));
    }
    public ShapeFactory()
    {

    }
    public HashMap <String, Shape> shapes =new HashMap<String,Shape>(){

    };
    @Override
    public Shape factoryMethod(String name, double x, double y, int line, Color colorborder, Color colorfill, double width, double height ){
        if(Objects.equals(name, "Пятиугольник")){
            return new  Pentagon(line, colorborder, colorfill, x, y,0,0);
        }
        else if(Objects.equals(name, "Квадрат")){
            return new Square(line, colorborder, colorfill, x, y, width, height);
        }
        else if(Objects.equals(name, "Треугольник")){
            return new Triangle(line, colorborder, colorfill, x, y,0,0);
        }
        else if(Objects.equals(name, "Угол")){
            return new Angle(x,y,line, colorborder, colorfill,0,0);
        }
        else if (Objects.equals(name, "Прямая")){
            return new Straight(line, colorborder, colorfill, x, y,0,0);
        }
        else if(Objects.equals(name, "Круг")){
            return new Circle(line, colorborder, colorfill, x, y, width, height);
        }
        else{
            return null;
        }
    }
}