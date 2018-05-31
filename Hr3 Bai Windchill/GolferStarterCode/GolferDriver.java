import java.util.Scanner;

public class GolferDriver
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		String golfern;
		String golferi;
		int golfers;
		
		Golfer g1 = new Golfer();
		Golfer g2 = new Golfer();
		Golfer g3 = new Golfer();
		
		System.out.println("What is the first golfer's name? \n");
		golfern = keyboard.nextLine ();	

		System.out.println("What is the first golfer's ID? \n");
		golferi = keyboard.nextLine ();	

		System.out.println("What is the first golfer's score? \n");
		golfers = keyboard.nextInt ();	

		g1.setGolferName (golfern);
		g1.setGolferIdentification (golferi);
		g1.setGolferScore (golfers);
		System.out.println(g1);
		
		
		System.out.println("What is the second golfer's name? \n");
		golfern = keyboard.nextLine ();	
		golfern = keyboard.nextLine ();	

		System.out.println("What is the second golfer's ID? \n");
		golferi = keyboard.nextLine ();	

		System.out.println("What is the second golfer's score? \n");
		golfers = keyboard.nextInt ();

		g2.setGolferName (golfern);
		g2.setGolferIdentification (golferi);
		g2.setGolferScore (golfers);
		System.out.println(g2);

		
		System.out.println("What is the third golfer's name? \n");
		golfern = keyboard.nextLine ();	
		golfern = keyboard.nextLine ();	

		System.out.println("What is the third golfer's ID? \n");
		golferi = keyboard.nextLine ();	

		System.out.println("What is the third golfer's score? \n");
		golfers = keyboard.nextInt ();

		g3.setGolferName (golfern);
		g3.setGolferIdentification (golferi);
		g3.setGolferScore (golfers);
		System.out.println(g3);
	}
}