/**
 * 
 */
package shapes.Manipulation3d;

import shapes.Shape;
import shapes.ShapeLocation;
import shapes.ShapeVector;

/**
 * @author jcTyler
 *
 */
public final class Manipulate
{
    public Shape rotate(Shape shape, int xDegree, int yDegree, int zDegree)
    {
        return shape;
    }
    public Shape translate(Shape shape, ShapeVector vector)
    {
        shape.getCenter().add(vector);
        for (ShapeLocation shapeLocation: shape.getLocations())
        {
            shapeLocation.add(vector);
        }
        return shape;
    }
}
