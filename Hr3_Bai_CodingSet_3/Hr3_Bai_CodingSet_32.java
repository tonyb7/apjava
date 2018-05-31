import java.util.Scanner;
public class Hr3_Bai_CodingSet_32
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter an integer between 50 and 100");
        int integer = reader.nextInt();
        if(integer<=50||integer>=100){
            System.out.println("Sorry, not following directions will cost you dearly :-(");
        } else {
            System.out.println("Congratulations! You won $0!");
        }
    }
}
