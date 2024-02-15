package com.example.task8;

import Interface.ChristmasTree;
import Models.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Pane paneBalls;
    @FXML
    private Pane paneMishura;
    @FXML
    private Pane paneGirland;
    @FXML
    private Pane panePresent;
    @FXML
    private Pane paneTree;
    @FXML
    private Pane paneStar;
    ChristmasTree tree;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      //  paneTree.toFront();
     tree= new ChristmasTreeImpl();
        tree.draw(paneTree);
    }
    @FXML
    private void addLights()
    {
      this.paneTree.getChildren().clear();
tree = new Girland(tree);
     //   paneTree.toFront();
        tree.draw(paneTree);
    }
    @FXML
    private void addPresents()
    {
      tree = new Presents(tree);
       this.paneTree.getChildren().clear();
//        paneTree.toFront();e
        tree.draw(paneTree);
    }
    @FXML
    private void addBalls()
    {
      this.paneTree.getChildren().clear();
        tree= new Star(tree);
   tree = new Balls(new Star(tree));
   //     paneTree.toFront();
        tree.draw(paneTree);
    }
    @FXML
    private void addMishura()
    {
       this.paneTree.getChildren().clear();

 tree= new Mishura(tree);
    //    paneTree.toFront();
        tree.draw(paneTree);
    }
    @FXML
    private void addStar()
    {
      this.paneTree.getChildren().clear();
      tree = new Star(tree);
//paneStar.toFront();

tree.draw(paneTree);
    //    paneTree.toFront();

    }
    @FXML
    private void addAll()
    {
       this.paneTree.getChildren().clear();
     //   paneTree.toBack();

     //   paneTree.toFront();
        tree =   new Balls(tree);
        tree =    new Star(tree);
       tree = new Mishura(tree);
      tree=  new Girland(tree);
        tree =  new Presents(tree);
        tree.draw(paneTree);

    }
    @FXML
    private void removeAll()
    {
        this.paneTree.getChildren().clear();
        tree = new ChristmasTreeImpl();
        this.tree.draw(this.paneTree);
    }
}