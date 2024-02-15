package Models;

import Decorator.TreeDecorator;
import Interface.ChristmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class ChristmasTreeImpl implements ChristmasTree {
    public ChristmasTreeImpl()
    {
        super();
    }
    @Override
    public void draw(Pane pane) {
        var firstPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREEN);


        }};
        var secondPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREEN);


        }};
        var thirdPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREEN);


        }};
        var fourPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREEN);


        }};
        var fifthPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREEN);


        }};
        var sixPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREEN);


        }};
        firstPath.getElements().addAll(
                new MoveTo(80, 450),
                new LineTo(330, 350),
                new LineTo(580, 450),
                new LineTo(80, 450),




                new ClosePath());

        secondPath.getElements().addAll(
                new MoveTo(330, 400),
                new LineTo(105, 400),
                new LineTo(330, 300),
                new LineTo(555, 400),
                new LineTo(330, 400),

                new ClosePath());
     thirdPath.getElements().addAll(
                new MoveTo(330, 350),

                new LineTo(130, 350),
                new LineTo(330, 250),
                new LineTo(530, 350),

                new LineTo(330, 350),
                new ClosePath());
      fourPath.getElements().addAll(
                new MoveTo(330, 300),

                new LineTo(155, 300),
                new LineTo(330, 200),
                new LineTo(505, 300),
                new LineTo(330, 300),

                new ClosePath()

        );
        fifthPath.getElements().addAll(
                new MoveTo(330, 250),

                new LineTo(180, 250),
                new LineTo(330, 150),
                new LineTo(480, 250),
                new LineTo(330, 250),

                new ClosePath()

        );
        sixPath.getElements().addAll(
                new MoveTo(330, 200),

                new LineTo(205, 200),
                new LineTo(330, 100),
                new LineTo(455, 200),
                new LineTo(330, 200),

                new ClosePath()

        );
        var leg = new Path() {{
            setFill(Color.BLACK);
            setFillRule(FillRule.EVEN_ODD);

        }};
        leg.getElements().addAll(
                new MoveTo(330, 475),
                new LineTo(280, 500),
        new LineTo(380, 500),

                new LineTo(330, 475)
        );
        var rectangle = new Rectangle(325, 450, 10, 30) {{
            setFill(Color.BLACK);
        }};
        pane.getChildren().addAll(firstPath,secondPath,thirdPath,fourPath, fifthPath,sixPath, rectangle, leg);
    }
}
