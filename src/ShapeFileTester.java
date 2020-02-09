public class ShapeFileTester
{
    static public void main(String args[])
    {
        String fileInput = null;
        AbstractShape shape = null;

        if(args.length == 1)
        {
            fileInput = args[0];
        }
        else
        {
            System.out.println("Error: Wrong input argument");
            System.exit(0);
        }
        ShapeReader reader = new ShapeReader();
        if(!reader.open(fileInput))
        {
            System.out.println("Error: Unable to open: " + fileInput);
            System.exit(0);
        }
        System.out.print("Trying to open file " + fileInput + ".......");
        System.out.print("success!\n\n");
        while((shape = reader.readShape()) != null)
        {
            System.out.println("readShape returned an object: " + shape.getClass());
            System.out.println(shape.toString());
            System.out.println(shape.calcPerimeter());
            System.out.println();
        }
        reader.close();
        System.exit(1);
    }
}
