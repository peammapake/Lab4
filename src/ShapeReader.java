import java.util.ArrayList;

/**
 * A class containing method to identify the read shapes
 * and generate shape respectively from the given information
 */
public class ShapeReader extends TextFileReader
{
    /**
     * Method to read through lines from text file
     * and decided the shape that the given information belongs to
     * then generate the respective shape instance
     * @return AbstractShape depending on the type of shape as read
     */
    public AbstractShape readShape()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        AbstractShape latestShape = null;
        String[] splitString = null;
        String lineRead = super.getNextLine();
        if(lineRead != null)
        {
            /*Split the information into token seperate through the whitespace in between*/
            splitString = lineRead.split("\\s+");
        }
        else return null;
        /*Switch case depend on the shape type as identify on the first token*/
        switch(splitString[0])
        {
            case "SQUARE":
                for(int i = 1; i < 4; i++)
                {
                    try
                    {
                        list.add(Integer.parseInt(splitString[i]));
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Error number format does not match on: " + lineRead);
                    }

                }
                latestShape = new Square(list.get(0),list.get(1),list.get(2));
                break;
            case "TRIANGLE":
                for(int i = 1; i < 7; i++)
                {
                    try
                    {
                        list.add(Integer.parseInt(splitString[i]));
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Error number format does not match on: " + lineRead);
                    }
                }
                latestShape = new Triangle(list.get(0),list.get(1),list.get(2)
                        ,list.get(3),list.get(4),list.get(5));
                break;
            case "CIRCLE":
                for(int i = 1; i < 4; i++)
                {
                    try
                    {
                        list.add(Integer.parseInt(splitString[i]));
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Error number format does not match on: " + lineRead);
                    }
                }
                latestShape = new Circle(list.get(0),list.get(1),list.get(2));
                break;
            case "DIAMOND":
                for(int i = 1; i < 5; i++)
                {
                    try
                    {
                        list.add(Integer.parseInt(splitString[i]));
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Error number format does not match on: " + lineRead);
                    }
                }
                latestShape = new Diamond(list.get(0),list.get(1),list.get(2),list.get(3));
                break;
            default:
                return null;
        }
        return latestShape;
    }
}
