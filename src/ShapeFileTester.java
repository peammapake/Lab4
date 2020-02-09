/**
 * Program to read through the shape type and coordinate from a text file
 * and print out its coordinate and parameter
 * By Bhimapaka Thapanangkun
 * ID: 60070503447
 */
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
        /*Check if the input file can be found, if not terminate program immediately*/
        if(!reader.open(fileInput))
        {
            System.out.println("Error: Unable to open: " + fileInput);
            System.exit(0);
        }
        System.out.print("Trying to open file " + fileInput + ".......");
        System.out.print("success!\n\n");
        /*Loop through each line within text file and print result until there is no next line*/
        while((shape = reader.readShape()) != null)
        {
            System.out.println("readShape returned an object: " + shape.getClass());
            System.out.println(shape.toString());
            System.out.println(shape.calcPerimeter());
            System.out.println();
        }
        /*Close the file once we read through all the line*/
        reader.close();
        System.exit(1);
    }
}
