/**
 * 
 */
package shapes.components;

import java.util.ArrayList;

import shapes.ShapeComponent;
import shapes.ShapeLocation;
import shapes.ShapeVector;

// TODO: Auto-generated Javadoc
/**
 * The Class Line.
 *
 * @author jcTyler
 */
/**
 * @author jcTyler
 *
 */
public class Line extends ShapeComponent
{
	
	/** The line origin. */
	private ShapeLocation lineOrigin;
	
	/** The line vector. */
	private ShapeVector lineVector;

	/**
	 * Instantiates a new line. This line will create a point at the endpoint of
	 * the line as well. If 2 lines are going to intersect, it is preferable to
	 * make the line have length (length - spacing)
	 *
	 * @param spacing            the spacing
	 * @param lineOrigin            the line origin
	 * @param lineVector the line vector
	 */
	public Line(double spacing, ShapeLocation lineOrigin,
			ShapeVector lineVector)
	{
		super(spacing);
		this.lineOrigin = lineOrigin;
		this.lineVector = lineVector;
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
		this.center = lineOrigin.add(lineVector.getX() / 2,
				lineVector.getY() / 2);
		for (double i = 0; i < lineVector.getLength(); i += spacing)
		{
			locations.add(
					new ShapeLocation(lineOrigin.getX() + lineVector.getX() * i,
							lineOrigin.getY() + lineVector.getY() * i));
		}
	}

	/**
	 * Gets the end point.
	 *
	 * @return the end point
	 */
	public ShapeLocation getEndPoint()
	{
		return locations.get(locations.size() - 1);
	}

}
