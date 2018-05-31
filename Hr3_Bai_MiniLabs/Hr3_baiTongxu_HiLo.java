/* MiniLab 5 - HiLo
 * Tony Bai
 * Version 1
 */
import java.util.Scanner;
public class Hr3_baiTongxu_HiLo
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int compNum = (int)(Math.random()*100)+1;
        final int lowBound = 1;
        final int highBound = 100;
        System.out.println("I have an integer between 1 and 100, inclusive. Guess it.");
        int keepGoing = 1;
        int numGuesses = 0;
        while(keepGoing==1){
            int userGuess = reader.nextInt();
            if(userGuess<lowBound||userGuess>highBound){
                System.out.println("Your number is out of bounds. Please try again.");
            } else if(userGuess<compNum){
                System.out.println("Your guess of "+userGuess+" is too low. Try again.");
                numGuesses = numGuesses + 1;
            } else if(userGuess>compNum){
                System.out.println("Your guess of "+userGuess+" is too high. Try again.");
                numGuesses = numGuesses + 1;
            } else {
                System.out.println("You got it! The number was "+compNum+" and it took you "+numGuesses+" tries to guess it!");
                keepGoing = 0;
            }
        }
    }
}