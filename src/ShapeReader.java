public class ShapeReader extends TextFileReader
{
    public AbstractShape readShape()
    {
        AbstractShape latestShape = null;
        String lineRead = super.getNextLine();
        String[] splitString = lineRead.split("\\s+");
        switch(splitString[0]) {
            case "SQUARE":
                int x = Integer.parseInt(splitString[1]);
                int y = Integer.parseInt(splitString[2]);
                int side = Integer.parseInt(splitString[3]);
                latestShape = new itsSquare(x,y,side);
                break;
            case "TRIANGLE":
                int
                break;
        }
    }
}
