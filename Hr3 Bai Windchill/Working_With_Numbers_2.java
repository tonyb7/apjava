import java.util.Scanner;
public class Working_With_Numbers_2
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[][] num = new int[2][2];
        num[0][0]=reader.nextInt();
        num[0][1]=reader.nextInt();
        num[1][0]=reader.nextInt();
        num[1][1]=reader.nextInt();
        System.out.println("The first element of the matrix is: "+num[0][0]);
        System.out.println("The last element of the matrix is: "+num[1][1]);
        System.out.println("The matrix in all its glory:");
        Print_It(num);
        System.out.println("The row sums are:");
        int[] rowSums = new int[num.length];
        for(int i=0; i<rowSums.length; i++){
            rowSums[i] = calcRowSum(num, i);
            System.out.println(rowSums[i]);
        }
        
    }
    public static void Print_It(int[][] arr){
        System.out.println(arr[0][0]+" "+arr[0][1]);
        System.out.println(arr[1][0]+" "+arr[1][1]);
    }
    public static int calcRowSum(int[][] arr, int row){ 
        int sum = 0;
        for(int i=0; i<2; i++){
             sum = sum + arr[row][i];
        }
        return sum;
    }
    
    public static int[] calcRowSu(int[] arr, int row){ 
        return(arr);
    }
}