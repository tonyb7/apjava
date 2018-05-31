import java.util.Scanner;
public class Hr3_Bai_CodingSet_25
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = reader.nextInt();
        if(age<5){
            System.out.println("Entry fee: Free");
        } else if (age>=65) {
            System.out.println("Entry fee: $1.50");
        } else {
            System.out.println("Entry fee: $2.50");
        }
    }
}