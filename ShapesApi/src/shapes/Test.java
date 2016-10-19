package shapes;

import shapes.premadeShapes.SmileyFace;

public class Test
{
    public static void main(String[] args)
    {
        //test
        Shape smileyFace = new SmileyFace(.1);
        for (ShapeLocation loc: smileyFace.getLocations())
        {
            System.out.print("(" + loc.getX() + "," + loc.getY() + ")");
        }
    }
}
