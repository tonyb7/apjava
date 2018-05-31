import java.util.Scanner;
public class Hr3_Bai_CodingSet_41
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Spiff 1");
        System.out.println("Gimme a lower bound. Inclusive");
        int inf = reader.nextInt();
        System.out.println("Gimme an upper bound. Inclusive");
        int sup = reader.nextInt();
        System.out.println("These are the even numbers between you lower bound and upper bound, inclusive.");
        for(int i = inf; i<=sup; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Spiff 2");
        System.out.println("Give me another number. Quick.");
        int k = reader.nextInt();
        System.out.println("These are the numbers within your range and that multiples of that number.");
        for(int i = inf; i<=sup; i++){
            if(i%k==0){
                System.out.println(i);
            }
        }
    }
}