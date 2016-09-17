/*
 * 
 */
package shapes;

// TODO: Auto-generated Javadoc
/**
 * The Class ShapeLocation.
 */
public class ShapeLocation
{

	/** The x. */
	private double x;

	/** The y. */
	private double y;

	/**
	 * Instantiates a new shape location.
	 *
	 * @param x the x location
	 * @param y the y location
	 */
	public ShapeLocation(double x, double y)
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
	 * Adds the.
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
}
