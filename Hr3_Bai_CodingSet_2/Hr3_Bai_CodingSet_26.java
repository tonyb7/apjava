import java.util.Scanner;
public class Hr3_Bai_CodingSet_26
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter year of birth: ");
        int yob = reader.nextInt();
        if(yob<1970){
            System.out.println("You qualify for the Juke Box Rally!");
            System.out.println("What is your favorite fruit (singular)?");
            reader.nextLine();
            String fruit = reader.nextLine();
            if(fruit.equalsIgnoreCase("strawberry")){
                System.out.println("Strawberry Fields Forever");
            } else {
                System.out.println("Bye bye, Miss American Pie");
            }
        }
    }
}