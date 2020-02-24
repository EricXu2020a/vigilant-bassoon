package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		this("");
		compChoice = randomGen();
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		compChoice = randomGen();
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compChoice = randomGen();
	}

	public String randomGen()
	{
		int random = (int) (Math.random()*3);
		if (random == 0)
			return "R";
		if (random == 1)
			return "P";
		else
			return "S";
	}
	public String determineWinner()
	{
		if (playChoice.equals("R") && compChoice.contentEquals("P"))
			return "!Computer wins <<Paper Covers Rock>>!";
		if (playChoice.equals("R") && compChoice.contentEquals("S"))
			return "!Player wins <<Rock Breaks Scissors>>!";
		if (playChoice.equals("R") && compChoice.contentEquals("R"))
			return "!Draw Game!";
		if (playChoice.equals("P") && compChoice.contentEquals("P"))
			return "!Draw Game!";
		if (playChoice.equals("P") && compChoice.contentEquals("S"))
			return "!Computer wins <<Scissors Cuts Paper>>!";
		if (playChoice.equals("P") && compChoice.contentEquals("R"))
			return "!Player wins <<Paper Covers Rock>>!";
		if (playChoice.equals("S") && compChoice.contentEquals("P"))
			return "!Player wins <<Scissors Cuts Paper>>!";
		if (playChoice.equals("S") && compChoice.contentEquals("R"))
			return "!Computer wins <<Rock Breaks Scissors>>!";
		if (playChoice.equals("S") && compChoice.contentEquals("S"))
			return "!Draw Game!";
		else
			return "";
	}

	public String toString()
	{
		String output="player had "+playChoice+ "\n" +"computer had "+compChoice+ "\n" +determineWinner();
		return output;
	}
}