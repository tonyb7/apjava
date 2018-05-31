import java.util.*;
import java.io.*;
public class MiniLab_9
{
    public static void main(String[] args) throws IOException{
          Scanner reader = new Scanner(new File("inputD.txt"));
          ArrayList<Integer> values = new ArrayList<>();
          int count = 0;
          while(reader.hasNext()){
              values.add(reader.nextInt());
              count++;
            }
          System.out.println(values);
          System.out.println("Number of values: "+count);
          int[] rangeCount = new int[10];
          for(int i=0; i<values.size();i++){
              int floored = values.get(i)/10;
              rangeCount[floored]=rangeCount[floored]+1;
            }
          for(int j=-0; j<10; j++){
              System.out.print(j*10+"-"+(j*10+10)+"\t");
              for(int k=0; k<rangeCount[j]; k++){
                 System.out.print("*");
                } 
              System.out.println();
            }
    }
}