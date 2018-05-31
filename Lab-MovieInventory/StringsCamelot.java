
/**
 * Write a description of class StringsCamelot here.
 *
 * @author (your name)
 * @version (a version number or a date)
*/ import java.util.*;
public class StringsCamelot
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your last name");
        String lastname = reader.nextLine();
        String email = lastname+"@Camelot.com";
        System.out.println(email);
        String person = "King Arthur";
        System.out.println(person);
        person = person + " Guinevere";
        System.out.println(person);
        System.out.println("Enter your name");
        String name = reader.nextLine();
        System.out.println("Enter your street address");
        String address = reader.nextLine();
        System.out.println("Enter you city, state, and zip");
        String cst = reader.nextLine();
        System.out.println("Name: "+name+"\nAddress: "+address+"\nCity State Zip: "+cst);
        int citylength= cst.indexOf(","); //assumes format City, State Zip
        if(cst.indexOf(" ")<citylength){
            citylength = citylength-1; //assumes city names have max of 1 space
        }
        System.out.println("Length of Name of City: "+citylength);
        String PU = "Pendragon, Uther";
        System.out.println(PU.substring(11)+" "+PU.substring(0,9));
        System.out.println("Now, write a caption for the picture on your paper");
        String caption = reader.nextLine();
        System.out.println(caption);
        System.out.println("Length of caption: "+caption.length());
        System.out.println("4th character: "+caption.charAt(3));
    }
}
