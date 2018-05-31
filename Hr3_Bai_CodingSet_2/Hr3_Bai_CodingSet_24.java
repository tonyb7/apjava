import java.util.Scanner;
public class Hr3_Bai_CodingSet_24
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your first positive integer.");
        int one = reader.nextInt();
        System.out.println("Enter your first positive integer.");
        int two = reader.nextInt();
        if(one<two) {
            System.out.println(one);
            System.out.println(two);
        } else if (one>two) {
            System.out.println(two);
            System.out.println(one);
        } else {
            System.out.println("Your numbers are equal.");
        }
    }
}