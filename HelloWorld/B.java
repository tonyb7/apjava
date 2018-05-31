
/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
        final double Pi=3.1415;
        Scanner reader = new Scanner(System.in); //Reading from System.in
        //Scanner used for input and output_$
        double radius;
        System.out.println("len\'n\'gth?");
        radius = reader.nextInt(); //Scans the next token of input as an int and assigns into memory location called radius
        double width;
        System.out.println("width?");
        width = reader.nextInt();
        System.out.println("Area is:");
        System.out.println("\t this number: " + (radius*width));
        System.out.println("\n\n\n");
        System.out.println("---end of execution---");
        
    }
}
