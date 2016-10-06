/*
 * 
 */
package shapes;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Shape.
 *
 * @author jcTyler
 */
public abstract class Shape
{

	/** The shape components. */
	private ArrayList<ShapeComponent> shapeComponents = new ArrayList<ShapeComponent>();

	/** The shape points. */
	private ArrayList<ShapeLocation> shapePoints = new ArrayList<ShapeLocation>();

	/** The scale. */
	private double scale;

	/** The center. */
	private ShapeLocation center;
	
    protected ArrayList<ShapeComponent> components;

	/**
	 * If the default constructor is called, scale will default to 1.
	 */
	public Shape()
	{
		this.scale = 1;
		setupShape();
	}

	/**
	 * Scale is the scale of the shape. Call the default constructor to use the
	 * default scale of 1
	 *
	 * @param scale
	 *            the scale
	 */
	public Shape(double scale)
	{
	    if (scale >= 0.1)
	    {
	        this.scale = scale;
	        setupShape();
	    }
	    else
	    {
	        this.scale = 1;
	        setupShape();
	    }
	}

	/**
	 * This method gets called when a shape is initialized. When creating a new
	 * shape, all components should be created and added inside of this method
	 */
	protected abstract void setupShape();

	/**
	 * Gets the scale.
	 *
	 * @return the scale
	 */
	public double getScale()
	{
		return scale;
	}

	/**
	 * Gets the components.
	 *
	 * @return the components
	 */
	protected List<ShapeComponent> getComponents()
	{
		return shapeComponents;
	}
	
    public void addComponent(ShapeComponent component)
    {
        components.add(component);
    }
    public ArrayList<ShapeLocation> getLocations()
    {
        return shapePoints;
    }
    public ShapeLocation getCenter()
    {
        return center;
    }
}
