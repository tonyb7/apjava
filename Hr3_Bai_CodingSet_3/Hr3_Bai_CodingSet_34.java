import java.util.Scanner;
public class Hr3_Bai_CodingSet_34
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("To determine if you are eligible for honor roll, please enter you average (integer 1-100)");
        int grade = reader.nextInt();
        System.out.println("Now, how many courses are you taking?");
        int courses = reader.nextInt();
        System.out.println("Do you have any discipline infractions (Y/N)?");
        reader.nextLine();
        String disc = reader.nextLine();
        if(grade>=90&&courses>=5&&(disc.equals("n")||disc.equals("N"))){
            System.out.println("You are eligible for the Honor Roll!");
    } else {
        System.out.println("You are not eligible for the Honor Roll. Sorry.");
    }
}
}
