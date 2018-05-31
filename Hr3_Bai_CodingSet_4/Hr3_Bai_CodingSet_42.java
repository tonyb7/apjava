import java.util.Scanner;
import java.util.Random;
public class Hr3_Bai_CodingSet_42
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("I will think of a number between 1 and x. Choose x.");
        int max = reader.nextInt();
        int target = rand.nextInt(max)+1;
        System.out.println("I have an integer between 1 and "+max+", inclusive. Guess it.");
        for(int i=0; i<5; i++){
            int[] guess = new int[5];
            guess[i] = reader.nextInt();
            int j = i+1;
            int k = 4-i;
            if(guess[i]-target==0){
                System.out.println("Yay! You guessed it! You took "+j+" guesses.");
                break;
            } else {
                int dist = Math.abs(guess[0] - target);
                int closest = guess[0];
                if(Math.abs(guess[i]-target)<dist){
                    dist = Math.abs(guess[i]-target);
                    closest = guess[i];
                }
                if(k>0&&guess[i]>target){
                    System.out.println("Too high. You have "+k+" guesses left.");
                } else if(k>0&&guess[i]<target){
                    System.out.println("Too low. You have "+k+" guesses left.");
                } else {
                    System.out.println("Wrong. You are out of guesses. You lose.");
                    System.out.println("Your guess of "+closest+" was closest and was "+dist+" away from the answer.");
                    System.out.println(target);
                }
            }
        }
    }
}