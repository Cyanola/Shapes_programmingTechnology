package Models;

import Decorator.TreeDecorator;
import Interface.ChristmasTree;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.shape.Shape;

import java.util.ArrayList;
import java.util.Random;

public class Girland  extends TreeDecorator {
    public Circle[] circle = new Circle[30];
    public Girland(ChristmasTree tree) {
        super(tree);
    }
    public void draw(Pane pane) {
        super.draw(pane);
        drawGirland(pane);
    }
    private final Random random = new Random();
    private final ArrayList<Color> colors = new ArrayList<>() {{
        add(Color.PINK);
        add(Color.RED);
        add(Color.PURPLE);
        add(Color.VIOLET);
        add(Color.MAGENTA);
        add(Color.ORANGE);
        add(Color.INDIGO);
        add(Color.BISQUE);
        add(Color.ALICEBLUE);
        add(Color.PALETURQUOISE);
        add(Color.GOLD);
        add(Color.YELLOW);
    }};
    private void drawGirland(Pane pane)
    {
        FadeTransition[] ft = new FadeTransition[30];

            var color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[0] = new Circle(380, 150, 10, color);
            color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[1] = new Circle(340, 170, 10, color);
            color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[2] = new Circle(300, 190, 10, color);
            color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[3] = new Circle(260, 205, 10, color);
            color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));

            circle[4] = new Circle(400, 205, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[5] = new Circle(365, 220, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[6] = new Circle(330, 230, 10,color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[7] = new Circle(290, 245, 10,color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[8] = new Circle(250, 255, 10,color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));

            circle[9] = new Circle(415, 255, 10,color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[10] = new Circle(380, 265, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[11] = new Circle(345, 275, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[12] = new Circle(310, 285, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[13] = new Circle(270, 295, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[14] = new Circle(235, 305, 10, color);

        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[15] = new Circle(430, 305, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[16] = new Circle(395, 315, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[17] = new Circle(360, 325, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[18] = new Circle(325, 335, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[19] = new Circle(290, 345, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[20] = new Circle(255, 355, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[21] = new Circle(220, 365, 10,color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));

            circle[22] = new Circle(445, 365, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[23] = new Circle(405, 375, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[24] = new Circle(370, 385, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[25] = new Circle(345, 395, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[26] = new Circle(310, 405, 10,color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[27] = new Circle(275, 415, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[28] = new Circle(240, 425, 10, color);
        color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            circle[29] = new Circle(205, 435, 10, color);



       for (int i=0;i <ft.length;i++)
       {
           if (i%2==0) {
               ft[i] = new FadeTransition(Duration.millis(250), circle[i]);
               ft[i].setFromValue(1.0);
               ft[i].setToValue(0.0);
               ft[i].setCycleCount(Timeline.INDEFINITE);
               ft[i].setAutoReverse(true);
               ft[i].play();
           }
           else
           {
               ft[i] = new FadeTransition(Duration.millis(250), circle[i]);
               ft[i].setFromValue(0.0);
               ft[i].setToValue(1.0);
               ft[i].setCycleCount(Timeline.INDEFINITE);
               ft[i].setAutoReverse(true);
               ft[i].play();
           }
       }
pane.getChildren().addAll(circle[0],circle[1],circle[2],circle[3],circle[4],circle[5],circle[6],circle[7],circle[8],circle[9], circle[10],
        circle[11], circle[12],circle[13],circle[14],circle[15],circle[16], circle[17],circle[18],circle[19],circle[20], circle[21],
        circle[22], circle[23],circle[24],circle[25],circle[26],circle[27], circle[28],circle[29]);
    }
}
