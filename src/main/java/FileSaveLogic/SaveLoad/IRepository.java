package  FileSaveLogic.SaveLoad;

import models.Shape;

import java.util.Stack;

public interface IRepository {
    public void addShape(Shape shape);
    public void popShape();
    public void setShape(Stack<Shape> stack);
    public Stack<Shape> getStackShapes();
}
