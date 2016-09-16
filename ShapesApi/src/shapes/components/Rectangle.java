/**
 * 
 */
package shapes.components;

import shapes.ShapeComponent;
import shapes.ShapeLocation;
import shapes.ShapeVector;

/**
 * The Class Rectangle.
 *
 * @author jcTyler
 */
public class Rectangle extends ShapeComponent
{
	
	/** The height. */
	private double height;
	
	/** The width. */
	private double width;
	
	/** The top left. */
	private ShapeLocation topLeft;
	
	/** The top side. */
	private Line topSide;
	
	/** The right side. */
	private Line rightSide;
	
	/** The bottom side. */
	private Line bottomSide;
	
	/** The left side. */
	private Line leftSide;
	

	/**
	 * Instantiates a new rectangle.
	 *
	 * @param spacing the spacing
	 * @param center the center of the rectangle
	 * @param height the height
	 * @param width the width
	 * @precondition it is preferable that spacing is a factor of height and width
	 */
	public Rectangle(double spacing, ShapeLocation center, double height, double width)
	{
		super(spacing);
		this.height = height;
		this.width = width;
		this.center = center;
	}
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param spacing the spacing
	 * @param height the height
	 * @param width the width
	 * @param topLeft the top left point of the rectangle
	 */
	public Rectangle(double spacing, double height, double width,
			ShapeLocation topLeft)
	{
		super(spacing);
		this.height = height;
		this.width = width;
		this.topLeft = topLeft;
	}

	/**
	 * Instantiates a new rectangle. Center will default to (0,0);
	 *
	 * @param spacing the spacing
	 * @param height the height
	 * @param width the width
	 * @precondition it is preferable that spacing is a factor of height and width
	 */
	public Rectangle(double spacing, double height, double width)
	{
		super(spacing);
		this.height = height;
		this.width = width;
		center = new ShapeLocation(0, 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see shapes.ShapeComponent#setUpComponent()
	 */
	@Override
	protected void setUpComponent()
	{
		topLeft = center.add(-(width / 2), height / 2); 
		double rectangleHeight = height - spacing;
		double rectangleWidth = width - spacing;
		topSide = new Line(spacing, topLeft,
				new ShapeVector(rectangleWidth, 0));
		rightSide = new Line(spacing, topSide.getEndPoint().addX(spacing),
				new ShapeVector(0,-rectangleHeight));
		bottomSide = new Line(spacing, rightSide.getEndPoint().addY(-spacing),
				new ShapeVector(-rectangleWidth, 0));
		leftSide = new Line(spacing, bottomSide.getEndPoint().addX(-spacing),
				new ShapeVector(0, rectangleHeight));
		locations.addAll(topSide.getLocations());
		locations.addAll(rightSide.getLocations());
		locations.addAll(bottomSide.getLocations());
		locations.addAll(leftSide.getLocations());
	}

}
