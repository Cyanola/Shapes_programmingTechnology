package Models;

import Decorator.TreeDecorator;
import Interface.ChristmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Star  extends TreeDecorator {
    public Star(ChristmasTree tree) {
        super(tree);
    }
    public void draw(Pane paneStar){
        super.draw(paneStar);
        drawStar(paneStar);
    }
    private void drawStar(Pane paneStar)
    {
        Path star = new Path();
        star.getElements().addAll(new MoveTo(330, 100),
                new LineTo(280,125),
                new LineTo(305,85),
                new LineTo(270,70),


                new LineTo(315,65),
                new LineTo(330,25),
                new LineTo(345,65),

                new LineTo(390,70),
                new LineTo(355,85),
                new LineTo(380,125),
                new LineTo(330, 100),
                new ClosePath());

        star.setFill(Color.GOLD);
        star.setStroke(Color.GOLD);
        star.setFillRule(FillRule.EVEN_ODD);
        paneStar.getChildren().addAll(star);
    }
}
