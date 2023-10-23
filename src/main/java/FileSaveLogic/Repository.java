package FileSaveLogic;

import models.Shape;
import FileSaveLogic.SaveLoad.IRepository;

import java.util.Stack;

public class Repository implements IRepository {
    private Stack<Shape> _shapes;
    public Repository(){
        _shapes = new Stack<>();
    }
    @Override
    public void addShape(Shape shape){
        _shapes.push(shape);
    }
    @Override
    public void setShape(Stack<Shape> stack) {_shapes = stack;}
    @Override
    public void popShape(){
        if (_shapes.empty()) return;
        _shapes.pop();
    }
    @Override
    public Stack<Shape> getStackShapes() {
        if (this._shapes ==null) this._shapes=new Stack<>();

        return this._shapes;
    }
}
