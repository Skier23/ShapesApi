package shapes;

import shapes.premadeShapes.SmileyFace;

public class Test
{
    public static void main(String[] args)
    {   
        Shape smileyFace = new SmileyFace(1);
        //test8 
        for (ShapeLocation loc: smileyFace.getLocations())
        {
            System.out.print("(" + loc.getX() + "," + loc.getY() + ")");
        }
    }
}
