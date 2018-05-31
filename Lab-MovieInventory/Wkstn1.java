
import java.util.Scanner;
public class Wkstn1
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
      
        int n = reader.nextInt();
        
        double teams = Math.floor(n/7);
        double players = n-teams*7;
        System.out.println("There will be "+teams+" teams with "+players+" left over.");
    }
}
