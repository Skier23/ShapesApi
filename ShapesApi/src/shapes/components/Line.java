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
	private ShapeLocation lineOrigin;
	private ShapeVector lineVector;

	/**
	 * Instantiates a new line.
	 *
	 * @param spacing
	 *            the spacing
	 * @param lineOrigin
	 *            the line origin
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
		for (double i = 0; i < lineVector.getLength(); i += spacing)
		{
			locations.add(
					new ShapeLocation(lineOrigin.getX() + lineVector.getX() * i,
							lineOrigin.getY() + lineVector.getY() * i));
		}
	}

}
