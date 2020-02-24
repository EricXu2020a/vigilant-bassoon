package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		RockPaperScissors game = new RockPaperScissors();	
		String response;
		boolean again = false;
		
		do {
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			response = keyboard.next().toUpperCase().substring(0, 1);
			
			game.setPlayers(response);
			
			System.out.println(game);
			System.out.print("\nDo you want to play again? ");
			
			if (keyboard.next().toLowerCase().charAt(0) == 'y') {
				again = true;
				System.out.println();
			}
			else again = false;
		}
		while(again);
		
		keyboard.close();	
	}
}



