/*
 * 
 */
package shapes.components;

import shapes.ShapeComponent;
import shapes.ShapeLocation;

// TODO: Auto-generated Javadoc
/**
 * The Class Circle.
 */
public class Circle extends ShapeComponent
{
	
	/** The radius. */
	private double radius;

	/**
	 * Instantiates a new circle.
	 *
	 * @param spacing
	 *            the spacing
	 * @param center
	 *            the center
	 * @param radius
	 *            the radius
	 */
	public Circle(double spacing, ShapeLocation center, double radius)
	{
		super(spacing);
	    this.center = center;
	    this.radius = radius;
	    setUpComponent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see shapes.ShapeComponent#setUpComponent()
	 */
	@Override
	protected void setUpComponent()
	{
		/**
		 * after lots of mathematical deriving, it was determined that to find
		 * the increment of theta that should be added repeatedly to generate a
		 * circle such that 2 points whose theta values are one increment apart
		 * and have distance = spacing, the following formula should be used. q
		 * = the increment that theta should be incremented by q = cos-1(1 -
		 * (spacing^2)/(2radius^2))
		 */
		double thetaIncrement = Math
				.acos(1 - ((spacing * spacing) / (2 * radius * radius)));
		int increments = (int) Math.round((2 * Math.PI * radius)/ thetaIncrement);
		thetaIncrement = (2 * Math.PI * radius) / increments;
		for (int i = 0; i < increments - 1; i ++)
		{
			locations.add(new ShapeLocation(radius * Math.cos(i * thetaIncrement),
					radius * Math.sin(i * thetaIncrement)));
		}
	}

}
