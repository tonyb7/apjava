import java.util.Scanner;
public class Hr3_Bai_CodingSet_31
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first triangle side length: ");
        double first = reader.nextDouble();
        System.out.println("Enter the second triangle side length: ");
        double second = reader.nextDouble();
        System.out.println("Enter the third triangle side length: ");
        double third = reader.nextDouble();
        if((first+second)<=third||(first+third)<=second||(second+third)<=third){
            System.out.println("That is not a triangle--it's degenerate!");
        } else if(first==second&&second==third){
                System.out.println("That is an equilateral triangle!");
            } else if(first==second||second==third||first==third) {
                System.out.println("That is an isosceles triangle!");
            } else {
                System.out.println("That is a scalene triangle!");
            }
        }
    }

