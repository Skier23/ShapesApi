package shapes.premadeShapes;

import shapes.Shape;
import shapes.ShapeLocation;
import shapes.ShapeVector;
import shapes.components.Line;

public class SimpleStar extends Shape
{
    public SimpleStar(double scale)
    {
        super(scale);
    }

    @Override
    protected void setupShape()
    {
        double shapeSpacing = 0.2;
        addComponent(new Line(shapeSpacing, new ShapeLocation(0, -1 * getScale()), new ShapeVector(0, 2 * getScale())));
        addComponent(new Line(shapeSpacing, new ShapeLocation(0, 1 * getScale()), new ShapeVector(0, -2 * getScale())));
        addComponent(new Line(shapeSpacing, new ShapeLocation(-1 * getScale(), 0), new ShapeVector(2 * getScale(), 0)));
        addComponent(new Line(shapeSpacing, new ShapeLocation(1 * getScale(), 0), new ShapeVector(-2 * getScale(), 0)));
        
    }
}
