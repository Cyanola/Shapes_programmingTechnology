package Models;

import Decorator.TreeDecorator;
import Interface.ChristmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Presents  extends TreeDecorator {

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
    private final Random random = new Random();
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public Presents(ChristmasTree tree) {
        super(tree);
        for (int i = 0; i < 600; i += 50){
            int size = this.random.nextInt(50,150);
            this.shapes.addAll(createPresent(i,510-size, size));
        }
    }

    public void draw(Pane pane) {
        super.draw(pane);
        pane.toFront();
        drawPresents(pane);
    }
    private void drawPresents(Pane pane)
    {
        for (var item : this.shapes) pane.getChildren().addAll(item);
    }
    private Collection<Shape> createPresent(int posX, int posY, int size) {
        var presentBox = new Rectangle(posX, posY, size, size);
        presentBox.setFill(colors.get(random.nextInt(0, colors.size() - 1)));

        var width = (int)(size / 8.0);
        var presentPackage = new Path() {{
            setFill(colors.get(random.nextInt(0, colors.size() - 1)));
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.DARKGRAY);
            getElements().addAll(
                    new MoveTo(posX + (int)(size / 2.0) - width, posY),
                    new LineTo(posX + (int)(size / 2.0) - width, posY + (int)(size / 2.0) - width),
                    new LineTo(posX, posY + (int)(size / 2.0) - width),
                    new LineTo(posX, posY + (int)(size / 2.0) + width),
                    new LineTo(posX + (int)(size / 2.0) - width, posY + (int)(size / 2.0) + width),
                    new LineTo(posX + (int)(size / 2.0) - width, posY + size),
                    new LineTo(posX + (int)(size / 2.0) + width, posY + size),
                    new LineTo(posX + (int)(size / 2.0) + width, posY + (int)(size / 2.0) + width),
                    new LineTo(posX + size, posY + (int)(size / 2.0) + width),
                    new LineTo(posX + size, posY + (int)(size / 2.0) - width),
                    new LineTo(posX + (int)(size / 2.0) + width, posY + (int)(size / 2.0) - width),
                    new LineTo(posX + (int)(size / 2.0) + width, posY),
                    new ClosePath()
            );
        }};
        return Arrays.stream(new Shape[] { presentBox, presentPackage }).toList();
    }

}
