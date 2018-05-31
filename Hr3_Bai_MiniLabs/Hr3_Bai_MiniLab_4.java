import java.util.Scanner;
import java.text.DecimalFormat;

public class Hr3_Bai_MiniLab_4 extends CLS
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        DecimalFormat value = new DecimalFormat("0.00");
        System.out.print("\u000C");
        int week = 0;
        double totmi = 0;
        double totgal = 0;
        System.out.println("How many miles driven this week? Enter -99 if vacation is over.");
        double miles = reader.nextDouble();
        while(miles!=-99){
            System.out.println("How many gallons of gas purchased this week?");
            double gallons = reader.nextDouble();
            week++;
            double mpg = miles/gallons;
            totmi = totmi + miles;
            totgal = totgal + gallons;
            double ovrmpg = totmi/totgal;
            System.out.println("Week: "+(week));
            System.out.println("Miles: "+value.format(miles)+"\t\tTotal vacation miles: "+value.format(totmi));
            System.out.println("Gallons: "+value.format(gallons)+"\t\tTotal vacation gallons: "+value.format(totgal));
            System.out.println("MPG: "+value.format(mpg)+"\t\tMPG for Vacation: "+value.format(ovrmpg)+"\n");
            System.out.println("How many miles driven this week? Enter -99 if vacation is over.");
            miles = reader.nextDouble();
        }
        System.out.println("Vacation Over!");
    }
}