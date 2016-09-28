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
        addComponent(new Line(shapeSpacing, new ShapeLocation(0, -1), new ShapeVector(0, 2)));
        addComponent(new Line(shapeSpacing, new ShapeLocation(0, 1), new ShapeVector(0, -2)));
        addComponent(new Line(shapeSpacing, new ShapeLocation(-1, 0), new ShapeVector(2, 0)));
        addComponent(new Line(shapeSpacing, new ShapeLocation(1, 0), new ShapeVector(-2, 0)));
        
    }
}
