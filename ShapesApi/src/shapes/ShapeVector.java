/**
 * 
 */
package shapes;

/**
 * @author jcTyler
 *
 */
public class ShapeVector
{
	private double x;
	private double y;
	public ShapeVector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public double getLength()
	{
		return Math.sqrt(x * x + y * y);
	}
}
