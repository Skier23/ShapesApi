package shapes.premadeShapes;

import shapes.Shape;
import shapes.ShapeLocation;
import shapes.ShapeVector;
import shapes.components.Arc;
import shapes.components.Circle;
import shapes.components.Line;

public class SmileyFace extends Shape
{
    public SmileyFace(double scale)
    {
        super(scale);
    }

    @Override
    protected void setupShape()
    {
        addComponent(new Circle(.2, new ShapeLocation(0, 0), 1 * getScale()));
        addComponent(new Arc(.2, new ShapeLocation(0, 0), .75 * getScale(), 225,
                270));
        
        // 1.4142136 = sqrt(2) the number is hard coded to increase performance
        addComponent(new Line(.2,
                new ShapeLocation(getScale() * (1.4142136 / 2),
                        getScale() * (1.4142136 / 2) - (getScale() / 4)),
                new ShapeVector(0, getScale() / 2)));
        addComponent(new Line(.2,
                new ShapeLocation(-getScale() * (1.4142136 / 2),
                        getScale() * (1.4142136 / 2) - (getScale() / 4)),
                new ShapeVector(0, getScale() / 2)));
    }
}
