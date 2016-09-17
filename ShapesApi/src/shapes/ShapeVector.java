/**
 * 
 */
package shapes;

// TODO: Auto-generated Javadoc
/**
 * The Class ShapeVector.
 */
public class ShapeVector
{
	
	/** The x. */
	private double x;
	
	/** The y. */
	private double y;

	/**
	 * Instantiates a new shape vector.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public ShapeVector(double x, double y)
	{
		this.x = x;
		this.y = y;
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
	 * Gets the length.
	 *
	 * @return the length
	 */
	public double getLength()
	{
		return Math.sqrt(x * x + y * y);
	}
}
