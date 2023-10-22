package Factory;

import javafx.scene.paint.Color;

import models.* ;


import java.util.HashMap;
import java.util.Objects;


public class ShapeFactory implements Creator {
    @Override
    public Shape factoryMethod(String name, double x, double y, int line, Color colorborder, Color colorfill ){
        if(Objects.equals(name, "Пятиугольник")){
            return new  Pentagon(line, colorborder, colorfill, x, y);
        }
        else if(Objects.equals(name, "Квадрат")){
            return new Square(line, colorborder, colorfill, x, y);
        }
        else if(Objects.equals(name, "Треугольник")){
            return new Triangle(line, colorborder, colorfill, x, y);
        }
        else if(Objects.equals(name, "Угол")){
            return new Angle(x,y,line, colorborder, colorfill);
        }
        else if (Objects.equals(name, "Прямая")){
            return new Straight(line, colorborder, colorfill, x, y);
        }
        else if(Objects.equals(name, "Круг")){
            return new Circle(line, colorborder, colorfill, x, y);
        }
        else{
            return null;
        }
    }
}