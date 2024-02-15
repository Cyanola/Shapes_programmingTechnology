package Models;

import Decorator.TreeDecorator;
import Interface.ChristmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.util.ArrayList;
import java.util.Random;

public class Mishura extends TreeDecorator {
    public Mishura(ChristmasTree tree) {
        super(tree);

    }
    public void draw(Pane pane) {
        super.draw(pane);
        drawMishura(pane);
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

    public void drawMishura(Pane pane){
        Path star = new Path();
        star.getElements().addAll(new MoveTo(250, 170),
                new LineTo(420,210),
new ClosePath(),

                new MoveTo(220, 210),
                new LineTo(440,260),
                new ClosePath(),

                new MoveTo(200, 250),
                new LineTo(460,310),
                new ClosePath(),

                new MoveTo(200 , 290),
                new LineTo(480,360),
                new ClosePath(),

                new MoveTo(200, 360),
                new LineTo(520,410),

                new ClosePath()
                //, new MoveTo(75, 410),
//                new LineTo(540,510),
//                new ClosePath()
        );
        var color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
        star.setFill(color);
        star.setStrokeWidth(30);
        star.setStroke(color);
        star.setFillRule(FillRule.EVEN_ODD);
        pane.getChildren().addAll(star);
    }
}
