package com.example.task1;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import models.Circle;
import models.Rectangle;
import models.Shape;
import models.Triangle;

import java.io.IOException;
import java.util.Random;

public class HelloController {
    @FXML
    public Label label0;
    @FXML
    public ColorPicker colorpickerFill;
    @FXML
    public ColorPicker colorpickerBorder;
    @FXML
    public Label labelx1;
    @FXML
    public Label labelx2;
    @FXML
    public Label labelx3;
    @FXML
    public Label labely1;
    @FXML
    public Label labely2;
    @FXML
    public Label labely3;
    @FXML
    public Button button1;
    @FXML
    public Button buttonClear;
    @FXML
    public TextField borde;
    @FXML
    public TextField x1;
    @FXML
    public TextField x2;
    @FXML
    public TextField x3;
    @FXML
    public TextField y1;
    @FXML
    public TextField y2;
    @FXML
    public TextField y3;

    @FXML Label labeltoString;
    Shape figure;

    public boolean logiccircle = false;
    public boolean logichandtriangle = false;

    public boolean logicrectangle = false;

    @FXML
    protected Canvas canvas;

    @FXML
    protected void onClick4() {


        if(check.isSelected()) {
            x3.setVisible(true);
            y3.setVisible(true);

            labelx3.setVisible(true);
            labely3.setVisible(true);
            labelx2.setPadding(new Insets(0, 0, 0, 0));
            labely2.setPadding(new Insets(0, 0, 0, 0));
            labelx2.setText("X2");
            labely2.setText("Y2");
            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);
            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);
            labelBorder.setLayoutX(labelBorder.getLayoutX() + 100);
            figure = new Triangle(colorpickerBorder.getValue(), colorpickerFill.getValue(), Integer.parseInt(borde.getText()),
                    Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()));
            GraphicsContext gr = canvas.getGraphicsContext2D();

            figure.setX1(Double.parseDouble(x2.getText()));
            figure.setY1(Double.parseDouble(y2.getText()));
            figure.setX2(Double.parseDouble(x3.getText()));
            figure.setY2(Double.parseDouble(y3.getText()));

            figure.drawHand(gr);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();

        }
        if(!check.isSelected())
        {
            x3.setVisible(true);
            y3.setVisible(true);

            labelx3.setVisible(true);
            labely3.setVisible(true);
            labelx2.setPadding(new Insets(0, 0, 0, 0));
            labely2.setPadding(new Insets(0, 0, 0, 0));
            labelx2.setText("X2");
            labely2.setText("Y2");
            x1.setVisible(true);
            y1.setVisible(true);
            labelx1.setVisible(true);
            labely1.setVisible(true);
            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);
        }
        logiccircle=false;
        logicrectangle=false;
        logichandtriangle=false;

    }
    @FXML Label labelBorder;
    @FXML
    CheckBox check;
    @FXML
    protected void onClick2() {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        logiccircle=true;
        if(!check.isSelected()) {
            x3.setVisible(false);
            y3.setVisible(false);

            labelx3.setVisible(false);
            labely3.setVisible(false);
            labelx2.setPadding(new Insets(0, -15, 0, 0));
            labely2.setPadding(new Insets(0, -15, 0, 0));
            labelx2.setText("Высота");
            labely2.setText("Ширина");
            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);
            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);
            labelBorder.setLayoutX(labelBorder.getLayoutX()-100);


        }
        if(check.isSelected()) {
            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);
            x3.setVisible(true);
            y3.setVisible(true);

            labelx3.setVisible(true);
            labely3.setVisible(true);
            labelx2.setPadding(new Insets(0, 0, 0, 0));
            labely2.setPadding(new Insets(0, 0, 0, 0));
            labelx2.setText("X2");
            labely2.setText("Y2");
            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);
            labelBorder.setLayoutX(labelBorder.getLayoutX()+100);
            figure = new Circle(colorpickerBorder.getValue(), colorpickerFill.getValue(),
                    Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()), Integer.parseInt(borde.getText()),
                    Double.parseDouble(x2.getText()),  Double.parseDouble(y2.getText()));


            figure.draw(gr, canvas);


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();

        }
        logicrectangle=false;
        logichandtriangle=false;
    }

    @FXML
    protected void onClickClear() {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        gr.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        logiccircle=false;
        logichandtriangle = false;
        logicrectangle=false;
    }

    @FXML
    protected void onClick() throws IOException {
        logichandtriangle = true;
        if(!check.isSelected()) {

            x3.setVisible(false);
            y3.setVisible(false);

            labelx3.setVisible(false);
            labely3.setVisible(false);
            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);

            x2.setVisible(false);
            y2.setVisible(false);

            labelx2.setVisible(false);
            labely2.setVisible(false);


            labelBorder.setLayoutX(labelBorder.getLayoutX()-100);

        }
        if(check.isSelected()) {
            x3.setVisible(true);
            y3.setVisible(true);

            labelx3.setVisible(true);
            labely3.setVisible(true);

            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);

            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);
            labelBorder.setLayoutX(labelBorder.getLayoutX()+100);
            GraphicsContext gr = canvas.getGraphicsContext2D();
            figure = new Triangle(colorpickerBorder.getValue(), colorpickerFill.getValue(),
                    Integer.parseInt(borde.getText()), Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()));


            figure.draw(gr, canvas);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();
        }
        logiccircle=false;
        logicrectangle=false;

    }


    @FXML
    protected void onMouseClicked(MouseEvent event) {
        Random rnd = new Random();
        GraphicsContext gr = canvas.getGraphicsContext2D();

        if (logichandtriangle && check.isSelected() ) {

            figure = new Triangle(colorpickerBorder.getValue(), colorpickerFill.getValue(),
                    Integer.parseInt(borde.getText()), event.getX(), event.getY());

            figure.draw(gr, canvas);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();
        }
        if(logiccircle && check.isSelected()) {

            double boundWidth = canvas.maxWidth(Double.MAX_VALUE);
            double    boundHeight = canvas.maxHeight(Double.MAX_VALUE);

            figure = new Circle(colorpickerBorder.getValue(), colorpickerFill.getValue(),
                    event.getX(), event.getY(), Integer.parseInt(borde.getText()),
                    rnd.nextDouble(boundHeight),    rnd.nextDouble(boundWidth));


            figure.draw(gr, canvas);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();

        }
        if(logicrectangle && check.isSelected()) {

            double boundWidth = canvas.maxWidth(Double.MAX_VALUE);
            double    boundHeight = canvas.maxHeight(Double.MAX_VALUE);

            figure = new Rectangle(colorpickerBorder.getValue(), colorpickerFill.getValue(),
                    event.getX(), event.getY(), Integer.parseInt(borde.getText()),
                    rnd.nextDouble(boundWidth), rnd.nextDouble(boundHeight)   );


            figure.draw(gr, canvas);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();

        }


    }
    @FXML
    protected void onClick3() throws IOException {
        logicrectangle=true;
        GraphicsContext gr = canvas.getGraphicsContext2D();
        if(!check.isSelected())
        {
            x3.setVisible(false);
            y3.setVisible(false);

            labelx3.setVisible(false);
            labely3.setVisible(false);

            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);
            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);


            labelx2.setPadding(new Insets(0, -15, 0, 0));
            labely2.setPadding(new Insets(0, -15, 0, 0));
            labelx2.setText("Высота");
            labely2.setText("Ширина");


            labelBorder.setLayoutX(labelBorder.getLayoutX()-100);
        }
        if(check.isSelected())
        {

            x3.setVisible(true);
            y3.setVisible(true);

            labelx3.setVisible(true);
            labely3.setVisible(true);

            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);

            labelBorder.setLayoutX(labelBorder.getLayoutX()+100);



            labelx2.setPadding(new Insets(0, 0, 0, 0));
            labely2.setPadding(new Insets(0, 0, 0, 0));
            labelx2.setText("X2");
            labely2.setText("Y2");
            figure = new Rectangle(colorpickerBorder.getValue(), colorpickerFill.getValue(),
                    Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()), Integer.parseInt(borde.getText()),
                    Double.parseDouble(y2.getText()),Double.parseDouble(x2.getText())   );


            figure.draw(gr, canvas);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("О фигуре");
            alert.setHeaderText("Сообщение");
            alert.setContentText(figure.toString());
            alert.show();

        }
        logiccircle=false;
        logichandtriangle = false;
    }

    @FXML
    protected void onClick5() throws IOException {
        logiccircle = true;
        if(!check.isSelected()) {

            x1.setVisible(false);
            y1.setVisible(false);

            labelx1.setVisible(false);
            labely1.setVisible(false);
            x3.setVisible(false);
            y3.setVisible(false);

            labelx3.setVisible(false);
            labely3.setVisible(false);

            x2.setVisible(false);
            y2.setVisible(false);

            labelx2.setVisible(false);
            labely2.setVisible(false);


            labelBorder.setLayoutX(labelBorder.getLayoutX()-100);

        }
        if(check.isSelected())
        {
            x3.setVisible(true);
            y3.setVisible(true);

            labelx3.setVisible(true);
            labely3.setVisible(true);

            x2.setVisible(true);
            y2.setVisible(true);

            labelx2.setVisible(true);
            labely2.setVisible(true);

            x1.setVisible(true);
            y1.setVisible(true);

            labelx1.setVisible(true);
            labely1.setVisible(true);

            labelBorder.setLayoutX(labelBorder.getLayoutX()+100);
        }
        logichandtriangle=false;
        logicrectangle=false;
    }

}