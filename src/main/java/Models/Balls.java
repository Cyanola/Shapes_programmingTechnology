package Models;

import Decorator.TreeDecorator;
import Interface.ChristmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import java.util.ArrayList;
import java.util.Random;

public class Balls extends TreeDecorator {
    public Balls(ChristmasTree tree) {
        super(tree);
        for (var index = 0; index < this.random.nextInt(10, 40); index++) {

            var posY = this.random.nextInt(150, 450);
            var posX = this.random.nextInt(205,445);

//            if(posX>=555&&posX <=580&&posY<=450&&posY>=400||posX<=555&&posX>=530&&posY<=400&&posY>=350 ||posX>=505&&posX<=530 &&posY<=350&&posY>=300
//            ||posX<=505&&posX>=480 &&posY<=300&&posY>=250||posX<=480&&posX>=455 &&posY<=250&&posY>=200
//                    ||
//
//                    posX>=105&&posX <=130 &&posY<=400&&posY>=350||
//                    posX<=105&&posX>=80 &&posY<=450&&posY>=400
//                    ||posX>=130&&posX<=155 &&posY<=350&&posY>=300
//                    ||posX<=180&&posX>=155 &&posY<=300&&posY>=250||posX<=205&&posX>=180  &&posY<=250&&posY>=200
//                    ||posX<=330&&posX>=205&&posY<=200&&posY>100
//                    ||posX>=330&&posX<=455&&posY<=200&&posY>100
//
//
//            ) {
//                while(posX>=555&&posX <=580&&posY<=450&&posY>=400||posX<=555&&posX>=530&&posY<=400&&posY>=350 ||posX>=505&&posX<=530 &&posY<=350&&posY>=300
//                        ||posX<=505&&posX>=480 &&posY<=300&&posY>=250||posX<=480&&posX>=455 &&posY<=250&&posY>=200
//                        ||
//                        posX>=105&&posX <=130 &&posY<=400&&posY>=350||
//                        posX<=105&&posX>=80 &&posY<=450&&posY>=400
//                        ||posX>=130&&posX<=155 &&posY<=350&&posY>=300
//                        ||posX<=180&&posX>=155 &&posY<=300&&posY>=250||posX<=205&&posX>=180  &&posY<=250&&posY>=200
//                        ||posX<=330&&posX>=205&&posY<=200&&posY>=100
//                        ||posX>=330&&posX<=455&&posY<=200&&posY>=100
//                )
//                {
//posX = this.random.nextInt(80,580);
//
//            }
//            }
                var color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
                this.shapes.add(new Circle(posX, posY, 7, color));
            }

    }
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public void draw(Pane pane) {
        super.draw(pane);
        drawBalls(pane);
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

    public void drawBalls(Pane pane){
        for (var item : this.shapes) {
            pane.getChildren().addAll(item);
        }
    }
}
