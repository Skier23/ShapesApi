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

    /** The shape points. */
    private ArrayList<ShapeLocation> shapePoints;

    /** The scale. */
    private double scale;

    /** The center. */
    private ShapeLocation center;

    protected ArrayList<ShapeComponent> components;

    private int xRotation;

    private int yRotation;

    private int zRotation;

    /**
     * If the default constructor is called, scale will default to 1.
     */
    public Shape()
    {
        components = new ArrayList<ShapeComponent>();
        shapePoints = new ArrayList<ShapeLocation>();
        this.scale = 1;
        setupShape();
        xRotation = 0;
        yRotation = 0;
        zRotation = 0;
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
        components = new ArrayList<ShapeComponent>();
        shapePoints = new ArrayList<ShapeLocation>();
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
        xRotation = 0;
        yRotation = 0;
        zRotation = 0;
    }

    /**
     * This method gets called when a shape is initialized. When creating a new
     * shape, all components should be created and added inside of this method
     */
    protected abstract void setupShape();

    /**
     * This method is used to store the rotation state of the shape. Never call
     * this method. It should be used only internally by the rotate method in
     * Manipulate
     * 
     * @param xRot
     * @param yRot
     * @param zRot
     */
    protected void rotate(int xRot, int yRot, int zRot)
    {
        if (xRot >= 360)
        {
            xRot = xRot % 360;
        }
        else if (xRot < 0)
        {
            xRot = 360 + (xRot % -360);
        }
        if (yRot >= 360)
        {
            yRot = yRot % 360;
        }
        else if (yRot < 0)
        {
            yRot = 360 + (yRot % -360);
        }
        if (zRot >= 360)
        {
            zRot = zRot % 360;
        }
        else if (zRot < 0)
        {
            zRot = 360 + (zRot % -360);
        }
        xRotation = xRot;
        yRotation = yRot;
        zRotation = zRot;

        for (ShapeLocation loc : shapePoints)
        {
            double x = loc.getX();
            double y = loc.getY();
            double z = loc.getZ();
            double newX = x * (Math.cos(zRot) * Math.cos(yRot))
                    + y * (Math.cos(zRot) * Math.sin(yRot) * Math.sin(xRot)
                            - Math.sin(zRot) * Math.cos(xRot))
                    + z * (Math.cos(zRot) * Math.sin(yRot) * Math.cos(xRot)
                            + Math.sin(zRot) * Math.sin(xRot));
            double newY = x * (Math.sin(zRot) * Math.cos(yRot))
                    + y * (Math.sin(zRot) * Math.sin(yRot) * Math.sin(xRot)
                            + Math.cos(zRot) * Math.cos(xRot))
                    + z * (Math.sin(zRot) * Math.sin(yRot) * Math.cos(xRot)
                            - Math.cos(zRot) * Math.cos(xRot));
            double newZ = -x * Math.sin(yRot) + y * Math.cos(yRot) * Math.sin(xRot)
                    + z * Math.cos(yRot) * Math.cos(xRot);
            

        }
    }

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
        return components;
    }

    public void addComponent(ShapeComponent component)
    {
        components.add(component);
        for (ShapeLocation loc: component.getLocations())
        {
            shapePoints.add(loc);
        }
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
