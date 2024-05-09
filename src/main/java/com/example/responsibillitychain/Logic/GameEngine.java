package com.example.responsibillitychain.Logic;

import com.example.responsibillitychain.HelloApplication;
import com.example.responsibillitychain.Models.EnterObject;
import com.example.responsibillitychain.Models.Player;
import com.example.responsibillitychain.Models.SceneObject;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameEngine {
    Player player;
    Pane pane;
    ActionChain chain;

    Label labelD;
    Label labelR;
    Label labelG;
    Label labelH;
    public  int maxX=38, maxY = 10;
    public List<EnterObject> objects = new ArrayList<EnterObject>();
    public GameEngine(Pane pane, Label labelD, Label labelR, Label labelG, Label labelH)
    {
     //   maxX= (int) pane.getMaxWidth();
        chain = new ActionChain();
        player = new Player();
        player.SetCords(25,9);

        this.pane = pane;
        this.labelD = labelD;
        this.labelR = labelR;
        this.labelG = labelG;
        this.labelH=labelH;
        GameMove(this.pane, this.labelD, this.labelR, this.labelG, this.labelH);
    }

    public Player getPlayer() {
        return player;
    }

    void DrawScene(Pane pane)
    {
        pane.getChildren().clear();
        pane.getChildren().add(player.asObj());
        for (int i = 0; i < objects.size(); i++) {
            pane.getChildren().add(objects.get(i).asObj());
        }
    }
    public void GameMove(Pane pane, Label labelD, Label labelR, Label labelG, Label labelH)
    {

        for (int i = 0; i < objects.size(); i++) {
            if(Objects.equals(objects.get(i).toString(), "Redstone") ||
                    Objects.equals(objects.get(i).toString(), "Gold") ||
                    Objects.equals(objects.get(i).toString(), "Diamond")) {
                if (player.X == objects.get(i).X && player.Y == objects.get(i).Y) {
                    System.out.println("Player.X: "+player.X+'\n'+
                            "Player.Y: "+player.Y+'\n'+
                            "Object.X: "+objects.get(i).X+'\n'
                            +"Object.Y: "+objects.get(i).Y+'\n');
                    chain.handle(objects.get(i).onEnter(), this);
                    objects.remove(i);
                }
            }
            else if(Objects.equals(objects.get(i).toString(), "Ground") ||Objects.equals(objects.get(i).toString(), "Health") ||
                    Objects.equals(objects.get(i).toString(), "Lava") ){

                if (player.X >= objects.get(i).X &&player.X < objects.get(i).X+2 && player.Y+1== objects.get(i).Y) {
                    chain.handle(objects.get(i).onEnter(), this);
                }
            }
        }
        DrawScene(pane);

        labelD.setText("Алмазы: " + player.Diamond);
        labelR.setText("Рубины: " + player.Redstone);
        labelG.setText("Золото: " + player.Gold);
        labelH.setText("Здоровье: " + player.Health);
        System.out.println("\n\n");
    }
    public boolean CheckCords(int X, int Y)
    {
        for (var o:
             objects) {
            if(o.X == X && o.Y == Y)
                return false;
        }
        return true;
    }
    public void PlayerMove(int X, int Y)
    {
        if(player.X+X < maxX && player.X+X >= 0)
            player.X += X;
        if(player.Y+Y < maxY && player.Y+Y >= 0)
            player.Y += Y;
    }
}
