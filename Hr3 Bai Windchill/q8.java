import java.io.*;
public class q8
{
    public static int roll(){
        return (int)(Math.random()*6+1);
    }
    public static int monopolyRoll(){
        int one = roll();
        int two = roll();
        if(one==two){
            int three = roll();
            int four = roll();
            return one+two+three+four;
        }
        return one+two;
    }
    public static void main(String[] args){
        System.out.println("Your roll is: "+monopolyRoll());
    }
}
