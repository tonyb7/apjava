import java.util.Scanner;
import java.text.DecimalFormat;
public class Hr3_Bai_MiniLab_3
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Society for the Prevention of Cruelty to Computers");
        System.out.println("Please enter your name or investigator ID.");
        String name = reader.nextLine();
        System.out.println("Please enter the name of the offender.");
        String offender = reader.nextLine();
        System.out.println("What cruelty offense did you observe?  Here are the choices:");
        DecimalFormat money = new DecimalFormat("0.00");
        double one = 49.95;
        double two = 99.95;
        double three = 149.95;
        double four = 499.95;
        System.out.println("\t1. Namecalling at the computer.\t\t$49.95");
        System.out.println("\t2. Finger shaking at the computer.\t$99.95");
        System.out.println("\t3. Yelling loudly at the computer.\t$149.95");
        System.out.println("\t4. Physically attacking the computer.\t$499.95");
        System.out.println("Please enter a number: ");
        int input = reader.nextInt();
        if(offender.equalsIgnoreCase("Minnie")&&name.equalsIgnoreCase("Mickey")&&(input==3||input==4)){
            System.out.println("Fines over $100 cannot be issued against a spouse!");
        } else if(input==1){
            System.out.println("Namecalling at the computer?! What an atrocity! "+offender+" has been fined $"+money.format(one)+" as reported by "+name);
        } else if(input==2){
            System.out.println("Finger shaking?! What an atrocity! "+offender+" has been fined $"+money.format(two)+" as reported by "+name);        
        } else if(input==3){
            System.out.println("Yelling?! What an atrocity! "+offender+" has been fined $"+money.format(three)+" as reported by "+name);        
        } else if(input==4&&offender.equalsIgnoreCase("Donald")){
            double four2 = 499.95*1.45;
            System.out.println("Physical assault?! What an atrocity! Donald gets a 45% fine. "+offender+" has been fined $"+money.format(four2)+" as reported by "+name);       
        } else if(input==4&&offender.compareTo("Donald")==0){
            System.out.println("Physical assault?! What an atrocity! "+offender+" has been fined $"+money.format(four)+" as reported by "+name);         
        }
    }
}