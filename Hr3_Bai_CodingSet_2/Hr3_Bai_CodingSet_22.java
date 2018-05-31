import java.util.Scanner;
public class Hr3_Bai_CodingSet_22
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int number = reader.nextInt();
        if(number%2==0) {System.out.println("Your number is even.");}
        else System.out.println("Your number is odd.");
    }
}