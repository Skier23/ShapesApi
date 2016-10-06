/**
 * 
 */
package shapes;

/**
 * The Class ShapeVector3.
 *
 * @author jcTyler
 */
public class ShapeVector
{

    /** The x. */
    private double x;

    /** The y. */
    private double y;

    /** The z. */
    private double z;

    /**
     * Instantiates a new shape vector.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param z
     *            the z
     */
    public ShapeVector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     * Instantiates a new shape vector. Only passing in 2 arguments sets z to 0;
     *
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public ShapeVector(double x, double y)
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
     * Gets the length.
     *
     * @return the length
     */
    public double getLength()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }
}
