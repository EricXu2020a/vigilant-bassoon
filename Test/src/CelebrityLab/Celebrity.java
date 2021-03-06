package CelebrityLab;


/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The hint to determine the celebrity
	 */
	private String hint;
	
	
	/**
	 * The name of the celebrity.
	 */
	private String name; 
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		setAnswer(answer);
		setClue(clue);
	}

	
	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return hint;
	}

	
	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return name;
	}

	
	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		hint = clue;
	}

	
	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		name = answer;
	}
	
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return "The celebrity is " + name + "!";
	}
	
}
