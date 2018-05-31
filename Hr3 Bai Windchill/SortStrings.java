// input, alphabetize names
import java.util.*;
import java.io.*;

public class SortStrings
{
    public static void main(String[] args) throws IOException{
      FileInputStream textFile = new FileInputStream("E.txt");
      Scanner inFile = new Scanner(textFile);
      System.out.println("File has been opened.");
      ArrayList<String> arrli = new ArrayList<String>(0);
      while(inFile.hasNextLine()){
          arrli.add(inFile.nextLine());
        }
      System.out.println(arrli);
      for(int j=0;j<arrli.size();j++){
        String min = arrli.get(j);
        int minLoc = j;
        for(int i=j; i<arrli.size();i++){
            if(arrli.get(i).compareTo(min)<0){
                min=arrli.get(i);
                minLoc=i;
            }
        }
        String temp = arrli.get(j);
        arrli.set(j, min);
        arrli.set(minLoc, temp);
      }
      System.out.println(arrli);
    }
}