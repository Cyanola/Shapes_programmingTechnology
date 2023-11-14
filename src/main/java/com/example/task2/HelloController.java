package com.example.task2;

import Factory.ShapeFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

public class HelloController implements Initializable {

    @FXML
    Button retBut;

    @FXML
    private TextField txtCount;
    @FXML
    private TextField widthCount;
    @FXML
    private TextField heightCount;


    Shape shape;
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
    private static void initializeHandlers(HelloController controller){
        controller.canvas.setOnMouseClicked(controller::canvasClickHandler);
    }
    @FXML
    private Label info;

    private void canvasClickHandler(MouseEvent event){
        double x = event.getX(); double y = event.getY();

        shape = shapeFactory.factoryMethod(txtCount.getText());

        if (shape == null) {
            var alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Сообщение");
            alert.setHeaderText("Ошибка");
            alert.setContentText("Такой фигуры не существует");
            alert.showAndWait();
            return;
        }

        shape.setColorBorder(this.borderPicker.getValue());
        shape.setColorFill(this.fillPicker.getValue());
        shape.setLineBorder(Integer.parseInt(borderCount.getText()));
        shape.setX(x); shape.setY(y);
        shape.draw(canvas, gc);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shapeFactory = new ShapeFactory();

        gc = canvas.getGraphicsContext2D();
  HelloController.initializeHandlers(this);

    }


}