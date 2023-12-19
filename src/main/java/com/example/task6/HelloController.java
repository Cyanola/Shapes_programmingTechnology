package com.example.task6;

import com.example.task6.models.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label label;
    @FXML
    Button effects;
    @FXML
    Button clear;
    @FXML
    ColorPicker colorpickerFill;
    @FXML
    ColorPicker colorpickerBorder;
    @FXML
    Canvas canvas;
    @FXML
    ListView listView;
    @FXML
    TextField lineWidth;
    private ObservableList<Shape> content;

@FXML

public void onClear()
{

    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
}
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Square square =new Square();

        Pentagon rectangle=new Pentagon();
Straight straight= new Straight();
        Circle circle=new Circle();
        Angle angle  = new Angle();

        Triangle triangle=new Triangle();

        content = FXCollections.observableArrayList (circle,square,rectangle,triangle, angle, straight);

        listView.setItems(content);

        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        gc = canvas.getGraphicsContext2D();
    }
    GraphicsContext gc;
    @FXML
    public void drawShape(MouseEvent mouseEvent){
        int index = listView.getSelectionModel().getSelectedIndex();

        Shape shape = (Shape) content.get(index).clone();

        shape.setColorFill(colorpickerFill.getValue());

        shape.draw(canvas,gc, mouseEvent.getX(), mouseEvent.getY(), Integer.parseInt(lineWidth.getText()),
                colorpickerBorder.getValue(),colorpickerFill.getValue() );

        label.setText(shape.descriptor());
    }

}