package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
	private String suit, rank;
	
		//int face
	private int face, pointValue;
	
	
  	//constructors
	public Card(String s, int value) 
	{
		this(s, value, 0);
	}
	
	public Card(String s, int f, int points) 
	{
		this(s, FACES[f - 1], f, points);
	}
	
	public Card(String r, String s, int points) 
	{
		this(s, r, -1, points);
	}
	
	public Card(String s, String r, int f, int points) 
	{
		suit = s;
		rank = r;
		face = f;
		pointValue = points;
	}

	
	// modifiers
		//set methods
	public void setSuit(String s) 
	{
		suit = s;
	}
	
	public void setRank(String r) 
	{
		rank = r;
	}
	
	public void setFace(int value) 
	{
		face = value;
	}
	
	public void setPointValue(int points) 
	{
		pointValue = points;
	}


  	//accessors
		//get methods
	public String getSuit() 
	{
		return suit;
	}
	
	public String getRank() 
	{
		return rank;
	}
	
	public int getFace() 
	{
		return face;
	}
	
	public int getPointValue() 
	{
		return pointValue;
	}
	
	public boolean matches(Card check) 
	{
		return check.getSuit() == suit && check.getFace() == face && check.getRank() == rank && check.getPointValue() == pointValue;
	}

	
  	//toString
	public String toString()
	{
		if (face == -1) 
			return rank + " of " + suit + " (point value = " + pointValue + ")";
		
		if (pointValue == 0) 
			return FACES[face - 1] + " of " + suit + " (point value = " + face + ")";
		
		return FACES[face - 1] + " of " + suit + " (point value = " + pointValue + ")";
	}
	
 }