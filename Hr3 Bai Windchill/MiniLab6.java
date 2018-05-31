import java.util.Scanner; 
/* Need to: 
 */
public class MiniLab6
{
    public static void main(String[] args) {
        System.out.println("Welcome to Windchill Calculator");
        Scanner reader = new Scanner(System.in);
        System.out.println("Do you want to use the calculator? (Enter \"No\" to stop)");
        String contin = reader.nextLine();
        while(!"no".equalsIgnoreCase(contin)){
            System.out.print("Do you want to enter Imperial Units (Enter 1) or Metric (Enter 2)?");
            int unitsystem = reader.nextInt();
            double degreesF = 0; double windM = 0;
            if(unitsystem==1){
                System.out.println("Please enter temperature in degrees Fahrenheit.");
                degreesF = reader.nextDouble();
                System.out.println("Now enter wind speed in miles per hour.");
                windM = reader.nextDouble();
            } else {
                System.out.println("Please enter temperature in degrees Celsius.");
                double degreesC = reader.nextDouble();
                System.out.println("Now enter wind speed in kilometers per hour.");
                double windK = reader.nextDouble();
                degreesF = (degreesC*9/5)+32;
                windM = 0.621371 * windK;
            }
            System.out.println("Using the old windchill formula, ");
            System.out.println("your temp of " + degreesF + " with a wind velocity of " + windM);
            System.out.println("actually ‘feels like’ " + Math.round(oldWindchill(degreesF, windM)) + " degrees,");
            System.out.println("and using the old windchill formula, ");
            System.out.println("it actually ‘feels like’ " + Math.round(newWindchill(degreesF, windM)) + " degrees.");      
            System.out.println("Do you want to use the calculator? (Enter \"No\" to stop)");
            reader.nextLine();
            contin = reader.nextLine();
        }
    }

    public static double oldWindchill(double t, double v) {
        double oldWC = 0.0817*(3.71*Math.pow(v,0.5)+5.81-0.25*v)*(t-91.4)+91.4;
        return oldWC;
    }

    public static double newWindchill(double t, double v) {
        return 35.74 + 0.6215*t - 35.75*Math.pow(v,0.16) + 0.4275*t*Math.pow(v, 0.16);
    }
}
