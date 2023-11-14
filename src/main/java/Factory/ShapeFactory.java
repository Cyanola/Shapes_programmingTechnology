package Factory;

import javafx.scene.paint.Color;

import models.* ;


import java.util.HashMap;
import java.util.Objects;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
public class ShapeFactory implements Creator {
    Map<String, Supplier<Shape>> shapes = Map.of( "Круг", Circle::new,

            "Квадрат",Square::new,
            "Треугольник",Triangle::new,
            "Пятиугольник",Pentagon::new,
            "Угол", Angle::new,
            "Прямая", Straight::new
    );

    @Override
    public Shape factoryMethod(String name ){
        var shape = shapes.get(name);

        if (shape == null) return null;
        return shape.get();
    }
}