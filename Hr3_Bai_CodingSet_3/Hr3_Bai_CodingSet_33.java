import java.util.Scanner;
public class Hr3_Bai_CodingSet_33
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("This program may contain a virus. Do you wish to continue (Y/N)?");
        String yesno = reader.nextLine();
        if(yesno.equalsIgnoreCase("y")) {
            System.out.println("You are a gambler!");
        } else if (yesno.equalsIgnoreCase("n")){
            System.out.println("Smart choice!");
        } else {System.out.println("That was not a Y or N. Do you hear coughing?");}
}}