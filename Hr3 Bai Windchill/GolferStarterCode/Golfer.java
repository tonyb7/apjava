public class Golfer
{
	private String golferName = new String("golferName");
	private String golferID = new String("golferID");
	private int golferScore = -1;
	
	public void setGolferName (String golfern)
	{
		golfername = golfern;
	}

	public void golferID (String golferi)
	{
		golferidentification = golferi;
	}
	
	public void setGolferScore (int score)
	{
		golferScore = score;
	}

	public String toString()
	{
		String result1 = "Golf score for " + golfername + ", with ID# is ";
		String result2 = golferID + ", is " + golferscore;
		
		return (result1 + result2);
	}
}