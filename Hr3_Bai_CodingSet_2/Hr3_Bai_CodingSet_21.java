
import java.util.Scanner;
public class Hr3_Bai_CodingSet_21
{
    public static void main(String[] args) {
        System.out.println("Please enter your name ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Please enter your age: ");
        int age = reader.nextInt();
        if(age>16) {
            System.out.println("It's scary, "+name+"...you are old enough to drive!");
        } else {
            int wait = 16 - age;
            System.out.println("You need to wait "+wait+" years to drive");
        }
        if(name.equals("Tony")){System.out.println("Hi Tony");}
        }
}
