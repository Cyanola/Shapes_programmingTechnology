package com.example.task2;

import Factory.ShapeFactory;
import FileSaveLogic.FIleManagerShape;
import FileSaveLogic.Repository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    Button saveBut;
    @FXML
    Button openBut;
    @FXML
    Button retBut;
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
                Integer.parseInt(borderCount.getText()),borderPicker.getValue(), fillPicker.getValue());

        //получить контекст(холст) для рисования

        shape.draw(canvas,gc);
        stack_shapes.addShape(shape);
        info.setText(shape.descriptor());
    }
    private Repository stack_shapes;
    private FileSaveLogic.FIleManagerShape fIleManager;
    private int initialValue;
    public Spinner<Integer> spinner;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shapeFactory = new ShapeFactory();
        gc = canvas.getGraphicsContext2D();
        fIleManager = new FIleManagerShape();
        stack_shapes = new Repository();
        var valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(5,30,initialValue);
        spinner.setValueFactory(valueFactory);
    }
    @FXML
    public void onOpen(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");

        fileChooser.getExtensionFilters().add(extensionFilter);
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File file = fileChooser.showOpenDialog(new Stage());

        if (file == null) return;

        stack_shapes.setShape(fIleManager.loadDataFromFile(file));

        InitShapes();
    }
    private void InitShapes(){
      gc= canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (var item: stack_shapes.getStackShapes()) {
            item.draw(canvas,gc);
        }
    }
    public void onReturn(ActionEvent actionEvent) {
        stack_shapes.popShape();
        InitShapes();
    }
    @FXML

    public void onSave(ActionEvent actionEvent) throws FileNotFoundException {
        fIleManager.saveDataToFile(stack_shapes.getStackShapes());
    }
}