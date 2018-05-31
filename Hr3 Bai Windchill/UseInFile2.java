import java.util.Scanner; 
import java.text.*;
import java.io.*;
import java.awt.*;

public class UseInFile2 {

  public static final int NUM = 10; // global constant for number of names

    public static void main(String[] args) throws IOException { // something NEW here!

        Scanner user = new Scanner(System.in);  
        Scanner inFile = new Scanner(new FileReader("classInFile2.txt"));
        DecimalFormat decFor = new DecimalFormat("0.00");

        // THIS IS NEW. Purpose = ? 
        // ANSWER:
        FileWriter fw = new FileWriter("Output1.out");  // THIS IS NEW.  Purpose = ?

        // THIS IS NEW. Purpose = ? 
        // ANSWER:
        PrintWriter output = new PrintWriter(fw);      
            
        int NUM =inFile.nextInt();
        inFile.nextLine();
            
        String first [] = new String[NUM];
        String last [] = new String[NUM];

        // What is the purpose of this loop?
        // ANSWER: 
        for (int i=0; i<NUM; i++){
            first[i]=inFile.next();
            last[i]=inFile.next();
            inFile.nextLine();
        } // end of what?

        // What is the purpose of this loop?
        // ANSWER: 
        System.out.println("\nName echo print");
        for (int i=0; i<NUM; i++){
            System.out.print(last[i] + ", " + first[i] + "\t\t");
            System.out.println();
        } // end of what?

        int keyLocation = -1;
        System.out.println("\nWhat last name would you like to search for?\t");
        String key = user.nextLine();
        for (int index=0; index < last.length; index++){
            if ( last[index].compareToIgnoreCase(key) == 0 )
                keyLocation = index;
        } // end of what?
        if (keyLocation != -1){
            System.out.print("Person with last name of " + key );
            System.out.println(" has a first name of " + first[keyLocation] );
        }
        else
            System.out.println("No person by that name in the list!");

        output.println("Pioneer drools, Huron rules");
        output.close( ); 
        fw.close( ); 
    } // end of what?
} // end of what?