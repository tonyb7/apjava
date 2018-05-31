import java.text.*;
import java.util.Scanner;
public class Wkstn2
{
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     System.out.println("Enter a two-digit number: ");
     int n = reader.nextInt();
     double tens = Math.floor(n/10);
     double ones = n-tens*10;
     DecimalFormat digit = new DecimalFormat("0");
     System.out.println("The first digit is "+digit.format(tens)+"\nThe second digit is "+digit.format(ones));
    }
}
