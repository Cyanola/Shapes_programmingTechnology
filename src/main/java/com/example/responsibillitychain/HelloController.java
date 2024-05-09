package com.example.responsibillitychain;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloController implements EventHandler<KeyEvent> {
    @FXML
    private Pane mainPane;
    @FXML
    private VBox mainWindow;
    @FXML
    public Label labelD;
    @FXML
    public Label labelR;
    @FXML
    public Label labelG;
    @FXML
    public Label labelH;
    GameEngine game;

    public void initialize()
    {
        mainPane.toFront();
        mainWindow.setOnKeyPressed(this::handle);
        game = new GameEngine(mainPane, labelD, labelR, labelG, labelH);
        game.objects.add(new Redstone(8,8));
        game.objects.add(new Redstone(5,3));
        game.objects.add(new Redstone(8,0));
        game.objects.add(new Redstone(0,1));
        game.objects.add(new Gold(7,1));
        game.objects.add(new Gold(5,6));
        game.objects.add(new Gold(1,4));
        game.objects.add(new Diamond(10,1));
        game.objects.add(new Diamond(5,7));

        game.objects.add(new Diamond(10,10));
        game.objects.add(new Diamond(9,7));
        game.objects.add(new Diamond(8,1));
        game.objects.add(new Diamond(15,7));
        game.objects.add(new Redstone(18,8));
        game.objects.add(new Redstone(25,3));
        game.objects.add(new Redstone(28,0));
        game.objects.add(new Redstone(20,1));
        game.objects.add(new Gold(17,1));
        game.objects.add(new Gold(25,6));
        game.objects.add(new Gold(15,4));
        game.objects.add(new Gold(32,1));
        game.objects.add(new Gold(34,6));
        game.objects.add(new Gold(30,4));
        game.objects.add(new Diamond(30,1));
        game.objects.add(new Diamond(28,7));
        game.objects.add(new Diamond(20,10));
        game.objects.add(new Diamond(28,7));
        game.objects.add(new Diamond(26,3));
        game.objects.add(new Diamond(23,7));

        game.objects.add(new Ground(0,10));
        game.objects.add(new Health(2,10));
        game.objects.add(new Ground(4,10));
        game.objects.add(new Lava(6,10));
        game.objects.add(new Ground(8,10));
        game.objects.add(new Lava(10,10));
        game.objects.add(new Lava(12,10));
        game.objects.add(new Ground(14,10));
        game.objects.add(new Ground(16,10));
        game.objects.add(new Health(18,10));
        game.objects.add(new Ground(20,10));
        game.objects.add(new Lava(22,10));
        game.objects.add(new Ground(24,10));
        game.objects.add(new Health(26,10));
        game.objects.add(new Ground(28,10));
        game.objects.add(new Lava(30,10));
        game.objects.add(new Lava(32,10));
        game.objects.add(new Lava(34,10));
        game.objects.add(new Lava(36,10));






        game.GameMove(mainPane, labelD, labelR, labelG, labelH);
    }
    @Override
    public void handle(KeyEvent e) {
        if (e.getCode() == KeyCode.W)
            game.PlayerMove(0, -1);
        if (e.getCode() == KeyCode.A)
            game.PlayerMove(-1, 0);
        if (e.getCode() == KeyCode.S)
            game.PlayerMove(0, 1);
        if (e.getCode() == KeyCode.D)
            game.PlayerMove(1, 0);



        game.GameMove(mainPane, labelD, labelR, labelG, labelH);
    }
}