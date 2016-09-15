package shapes;

public class ShapeLocation
{
    private double x;
    private double y;
    public ShapeLocation(double x, double y)
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
    public ShapeLocation add(double x, double y)
    {
    	this.x += x;
    	this.y += y;
    	return this;
    }
    public ShapeLocation addX(double x)
    {
    	this.x += x;
    	return this;
    }
    public ShapeLocation addY(double y)
    {
    	this.y += y;
    	return this;
    }
}
