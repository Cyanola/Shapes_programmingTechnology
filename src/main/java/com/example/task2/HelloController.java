package com.example.task2;

import Factory.ShapeFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import models.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public FlowPane flowpane;
    @FXML
    private TextField txtCount;
    @FXML
    private TextField widthCount;
    @FXML
    private TextField heightCount;

    @FXML
    private TextField borderCount;

    @FXML
    private ColorPicker fillPicker;
    @FXML
    private ColorPicker borderPicker;

    @FXML
    private Canvas canvas;

    ShapeFactory shapeFactory;
    GraphicsContext gc ;

    @FXML
    private Label info;
    @FXML
    Button clearbutton;
    @FXML
    protected void  onClear()
    {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        gr.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
    @FXML
    protected void onMouseClicked(MouseEvent event) {
        //get an object  and call its draw method.

        Shape shape = shapeFactory.factoryMethod(txtCount.getText(), event.getX(), event.getY(),
                Integer.parseInt(borderCount.getText()),borderPicker.getValue(), fillPicker.getValue(),Double.parseDouble(widthCount.getText()),
                Double.parseDouble(heightCount.getText()));

        //получить контекст(холст) для рисования

        shape.draw(canvas,gc);
        info.setText(shape.descriptor());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shapeFactory = new ShapeFactory();
        gc = canvas.getGraphicsContext2D();
    }
}