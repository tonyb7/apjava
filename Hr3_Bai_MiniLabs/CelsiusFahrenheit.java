import java.util.Scanner;
import java.text.DecimalFormat;
public class CelsiusFahrenheit
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("0.00");
        System.out.println("Choose a direction");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = reader.nextInt();
        if(choice==1){
            System.out.println("Enter celsivs. Enter -999 to quit.");
            double celsius = reader.nextDouble();
            while(celsius!=-999){
                double fahr = celsius*9/5+32;
                System.out.println("That is "+fahr+" fahrenheit.");
                System.out.println("Enter celsivs. Enter -999 to quit.");
                celsius = reader.nextDouble();
            }
        }   
        if(choice==2){
            System.out.println("Enter fahrenheit. Enter -999 to quit.");
            double fahr = reader.nextDouble();
            while(fahr!=-999){
                double celsius = 5*(fahr-32)/9;
                System.out.println("That is "+celsius+" celsius.");
                System.out.println("Enter fahrenheit. Enter -999 to quit.");
                fahr = reader.nextDouble();
            }
        }
    }
}