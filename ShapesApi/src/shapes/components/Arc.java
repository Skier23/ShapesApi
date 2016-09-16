/**
 * 
 */
package shapes.components;

import shapes.ShapeComponent;
import shapes.ShapeLocation;

/**
 * @author jcTyler
 *
 */
public class Arc extends ShapeComponent
{
	private double radius;
	private double theta1;
	private double theta2;
	public Arc(double spacing, ShapeLocation center, double radius, double theta1, double theta2)
	{
		super(spacing);
		this.radius = radius;
		this.theta1 = theta1;
		this.theta2 = theta2;
		this.center = center;
	}
	/* (non-Javadoc)
	 * @see shapes.ShapeComponent#setUpComponent()
	 */
	@Override
	protected void setUpComponent()
	{
		/**
		 * after lots of mathematical deriving, it was determined that to find
		 * the increment of theta that should be added repeatedly to generate an
		 * arc such that 2 points whose theta values are one increment apart
		 * and have distance = spacing, the following formula should be used. q
		 * = the increment that theta should be incremented by q = cos-1(1 -
		 * (spacing^2)/(2radius^2))
		 */
		double degreespan = theta2 - theta1;
		double thetaIncrement = Math
				.acos(1 - ((spacing * spacing) / (2 * radius * radius)));
		int increments = (int) Math.round((degreespan) / thetaIncrement);
		thetaIncrement = (degreespan) / increments;
		for (double i = theta1; i < increments; i += thetaIncrement)
		{
			locations.add(new ShapeLocation(radius * Math.cos(i),
					radius * Math.sin(i)));
		}
	}
}
