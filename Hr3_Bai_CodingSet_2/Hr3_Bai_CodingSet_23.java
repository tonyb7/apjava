import java.util.Scanner;
public class Hr3_Bai_CodingSet_23
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of words in your telegram: ");
        int words = reader.nextInt();
        double fifteen = words - 15;
        if(fifteen<=0) {
            System.out.println("Your telegram costs $8.50.");
        } else {
            double cost = 8.50 + (fifteen * 0.25);
            System.out.println("Your telegram costs $"+cost+".");
        }
    }
}