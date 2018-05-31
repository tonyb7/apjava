
import java.text.*;
import java.util.Scanner;
public class Wkstn3
{
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     System.out.println("Enter a three-digit number: ");
     int n = reader.nextInt();
     double hunds = Math.floor(n/100);
     double tens = Math.floor((n-hunds*100)/10);
     double ones = n-hunds*100-tens*10;
     DecimalFormat digit = new DecimalFormat("0");
     System.out.println("The first digit is "+digit.format(hunds));
     System.out.println("The second digit is "+digit.format(tens));
     System.out.println("The third digit is "+digit.format(ones));
    }
}