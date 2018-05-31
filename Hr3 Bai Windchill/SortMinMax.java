// input, alphabetize names
import java.util.Arrays;
public class SortMinMax extends Magpie2
{
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int k=0;k<10;k++){
            arr[k]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0; j<arr.length;j++){
            int min=arr[j];
            int minLoc=j;
            for(int i=j; i<arr.length;i+=1){
                if(arr[i]<min){
                    min=arr[i];
                    minLoc=i;
                }
            }
            //arr[minLoc]=arr[j];
            //arr[j]=min;
            int temp = arr[j];
            arr[j] = min;
            arr[minLoc]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
