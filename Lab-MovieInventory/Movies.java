import java.util.Scanner;
import java.text.*;
public class Movies
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double warGamesC;
    System.out.println("How much is WarGames?");
    warGamesC = input.nextDouble();
    int warGamesQ;
    System.out.println("How many WarGames does the store own?");
    warGamesQ = input.nextInt();
    double HiddenFiguresC;
    System.out.println("How much is Hidden Figures?");
    HiddenFiguresC = input.nextDouble();
    int hiddenFiguresQ;
    System.out.println("How many Hidden Figures does the store own?");
    hiddenFiguresQ = input.nextInt();
    double imitationGamesC;
    System.out.println("How much is Imitation Game?");
    imitationGamesC = input.nextDouble();
    int imitationGamesQ;
    System.out.println("How many Imitation Games does the store own?");
    imitationGamesQ = input.nextInt();
    
    System.out.println("\n");
    System.out.println("Video Title \t\t\tCost \t\t# in Stock");
    System.out.println("WarGames \t\t\t"+"$"+warGamesC+"\t\t"+warGamesQ); 
    System.out.println("Hidden Figures \t\t\t"+"$"+HiddenFiguresC+"\t\t"+hiddenFiguresQ); 
    System.out.println("The Imitation Game \t\t"+"$"+imitationGamesC+"\t\t"+imitationGamesQ); 
    
    double total;
    double average;
    total = warGamesC*warGamesQ+HiddenFiguresC*hiddenFiguresQ+imitationGamesC*imitationGamesQ;
    average = total/(warGamesQ+hiddenFiguresQ+imitationGamesQ);
    /*total = Math.round(total*100);
    average = Math.round(average*100);
    total = total/100;
    average = average/100;
    String.format("%.2f", total);
    String.format("%.2f", average);*/
    DecimalFormat money = new DecimalFormat("0.00");
    System.out.println("\nThe total value of all tapes is: $"+money.format(total));
    System.out.println("The average value is: $"+money.format(average));
}
}
