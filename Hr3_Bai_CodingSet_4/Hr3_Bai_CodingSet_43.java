import java.util.*;
public class Hr3_Bai_CodingSet_43
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("This is a Magic 8-Ball. Enter \"shake\" to shake.");
        String input = reader.nextLine();
        while(input.toLowerCase().equals("shake")){
            int result = random.nextInt(5)+1;
            System.out.println("Shaking...\nThinking...");
            try {
                Thread.sleep(3000);     
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if(result==1){
                System.out.println("Yes.");
            } else if(result==2){
                System.out.println("No.");
            } else if(result==3){
                System.out.println("Maybe.");
            } else if(result==4){
                System.out.println("Shake again.");
            } else if(result==5){
                System.out.println("I'm sleeping.");
            }
            System.out.println("Shake again or quit?");
            input = reader.nextLine();
        }
    }
}