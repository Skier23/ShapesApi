/**
 * 
 */
package shapes;

/**
 * @author jcTyler
 *
 */
public class ShapeLocation
{
    /** The x. */
    private double x;

    /** The y. */
    private double y;
    
    /** The z. */
    private double z;

    /**
     * Instantiates a new shape location.
     *
     * @param x the x location
     * @param y the y location
     */
    public ShapeLocation(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     * Instantiates a new shape location. Only passing in 2 arguments sets z to 0;
     *
     * @param x the x location
     * @param y the y location
     */
    public ShapeLocation(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    /**
     * Gets the x.
     *
     * @return the x
     */
    public double getX()
    {
        return this.x;
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Gets the z.
     *
     * @return the z
     */
    public double getZ()
    {
        return this.z;
    }
    /**
     * Adds values to the coordinates.
     *
     * @param x the x
     * @param y the y
     * @return the shape location
     */
    public ShapeLocation add(double x, double y, double z)
    {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }
    
    /**
     * Adds values to the coordinates.
     *
     * @param x the x
     * @param y the y
     * @return the shape location
     */
    public ShapeLocation add(double x, double y)
    {
        this.x += x;
        this.y += y;
        return this;
    }

    /**
     * Adds the X.
     *
     * @param x the x
     * @return the shape location
     */
    public ShapeLocation addX(double x)
    {
        this.x += x;
        return this;
    }

    /**
     * Adds the Y.
     *
     * @param y
     *            the y
     * @return the shape location
     */
    public ShapeLocation addY(double y)
    {
        this.y += y;
        return this;
    }
    
    /**
     * Adds the Z.
     *
     * @param z
     *            the z
     * @return the shape location
     */
    public ShapeLocation addZ(double z)
    {
        this.z += z;
        return this;
    }
    public ShapeLocation add(ShapeVector vector)
    {
        this.x += vector.getX();
        this.y += vector.getY();
        this.z += vector.getZ();
        return this;
    }
}
