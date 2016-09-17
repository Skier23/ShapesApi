/*
 * 
 */
package shapes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ShapeComponent.
 */
public abstract class ShapeComponent
{

	/** The spacing. */
	protected double spacing;

	/** The locations. */
	protected ArrayList<ShapeLocation> locations = new ArrayList<ShapeLocation>();

	/** The center. */
	protected ShapeLocation center;

	/** The default spacing. */
	private double defaultSpacing = 0.1;

	/**
	 * Instantiates a new shape component.
	 */
	public ShapeComponent()
	{
		spacing = defaultSpacing;
	}

	/**
	 * Instantiates a new shape component.
	 *
	 * @param spacing
	 *            the spacing between points
	 * @precondition spacing must be > 0
	 */
	public ShapeComponent(double spacing)
	{
		if ((spacing - 0) < 1e-4)
		{
			spacing = defaultSpacing;
			throw new IllegalArgumentException(
					"Spacing must be a value greater than 0");
		}
		this.spacing = spacing;
	}

	/**
	 * Gets the locations.
	 *
	 * @return the locations
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<ShapeLocation> getLocations()
	{
		ArrayList<ShapeLocation> locations = new ArrayList<ShapeLocation>();
		locations = (ArrayList<ShapeLocation>) this.locations.clone();
		return locations;

	}

	/**
	 * Sets up the component.
	 */
	protected abstract void setUpComponent();
}
