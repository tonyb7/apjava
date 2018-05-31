import java.util.Scanner;
public class Working_With_Numbers
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] num = new int[10];
        for(int h=0;h<num.length;h++){
            num[h]=reader.nextInt();
        }
        System.out.println(num[0]);
        System.out.println(num[num.length-1]);
        System.out.println(Average(num));
        Print_It(num);
    }
    public static void Print_It(int[] arr){
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static double Average(int[] arr){ 
        //what happen make priv?
        double sum = 0; //FIX THESE SO DOUBLE //ok
        for(int j = 0; j<arr.length;j++){
            sum+=arr[j];
        }
        return sum/arr.length;
    }
}
