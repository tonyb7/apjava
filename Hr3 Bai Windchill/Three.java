import java.util.*;
public class Three
{
    public static void main(String[] args){
        Random rand = new Random();
        int [] array = new int [10];
        System.out.print("\n");
        for(int i=0; i<array.length;i++){
             array[i]=rand.nextInt();
             System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        for(int j=array.length-1; j>-1;j--){
             System.out.print(array[j]+" ");
        }
        int countEven = 0;
        for(int i=0; i<array.length;i++){
             if(array[i]%2==0){
                 countEven++;
             }
        }
        System.out.print("\n");
        System.out.println("Number of even numbers is: "+countEven);
    }
}
