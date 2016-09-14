package Shapes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;

public class Shape
{
    private List<ShapeComponent> shapeComponents = new ArrayList<ShapeComponent>();
    private List<Location> shapePoints = new ArrayList<Location>();
    private double scale;
    private int test = 3;

    /**
     * If the default constructor is called, scale will default to 1
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
     */
    public Shape(double scale)
    {
        this.scale = scale;
        setupShape();
    }

    /**
     * This method gets called when a shape is initialized.
     * When creating a new shape, all components should be created and added
     * inside of this method
     */
    protected void setupShape()
    {

    }

    /**
     * 
     */
    protected void addArc()
    {

    }

    /**
     * 
     */
    protected void addLine()
    {

    }

    /**
     * 
     */
    protected void addCircle()
    {

    }
}
