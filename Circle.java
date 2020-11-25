import java.util.Scanner;

/**
 * Maman 11
 * This class present calculation of attribute in the Cartesian system
 *  Between rectangle and circles that in the re rectangle and out of it.
 * @author Itay Hatan
 * @version 16/10/20
 * */

public class Circle
{
    /** This method need to get from the user coordinates of two points in the Cartesian
     * axis system and calculate the radius, area and the perimeter of each rectangle.
     * */
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("This program calculates the areas " +
                "and the perimeters of the excircle and the incircle " +
                "of a given rectangle ");
        System.out.println("Please enter the two coordinates of the left " +
                "upper point of the rectangle: ");
        // Get coordinates from the user at (X ,Y) form
        int leftUpX = scan.nextInt();
        int leftUpY = scan.nextInt();
        System.out.println("Please enter the two coordinates of the left " +
                "upper point of the rectangle");
        int rightDownX = scan.nextInt();
        int rightDownY = scan.nextInt();

        // Calculate the radius of each circle
        double excircleRadius = (Math.sqrt(Math.pow((rightDownY - leftUpY), 2) + Math.pow((rightDownX - leftUpX) ,2)) / 2.0) ;
        double incircleRadius = (leftUpY - rightDownY) / 2.0 ;

        // Calculate the area of each circle
        double areaOfExcircle = Math.pow(excircleRadius, 2) * Math.PI;
        double areaOfIncircle = Math.pow(incircleRadius, 2) * Math.PI;

        // Calculate the scope of each circle
        double perimeterOfExcircle = 2 * Math.PI * excircleRadius;
        double perimeterOfIncircle = 2 * Math.PI * incircleRadius;

        // print the ID of the circles
        System.out.println("Incircle: radius = " + incircleRadius + ", area = " +
                areaOfIncircle + ", perimeter = " + perimeterOfIncircle);
        System.out.println("Excircle: radius = " + excircleRadius + ", area = " +
                areaOfExcircle + ", perimeter = " + perimeterOfExcircle);
    }
}
