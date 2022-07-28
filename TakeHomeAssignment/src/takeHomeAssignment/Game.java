package takeHomeAssignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Deck d = new Deck();

		Scanner s = new Scanner(System.in);	
		System.out.println("Welcome to the Mangatha Game ");
		System.out.println("Enter number of players ");
		int numberOfPlayers = s.nextInt();
		Random random = new Random();
		int host = random.nextInt(1,numberOfPlayers);
		boolean continuegame = true;
		
		while(continuegame) {
			Map<Integer,Player> playerDetails = new LinkedHashMap<Integer,Player>();
			double sumOfAllBets = 0;
			System.out.println("Player "+host+" Is Host ");
			
			for(int i=1;i<=numberOfPlayers;i++) {
				if(host==i) {
					playerDetails.put(i, null);
				}else {
					
					System.out.println("Player "+i+" Enter card number from 1-13: ");
					int rank = s.nextInt();
					System.out.println("Enter suit from 1-4: ");
					int suit = s.nextInt();
					Card c = new Card(rank,suit);
					System.out.println("Player "+i+" Enter Bet Amount");
					double bet = s.nextDouble();
					System.out.println("Player "+i+" Enter In Or Out ");
					String chosenOrientation = s.next();
					Player p = new Player(i,bet,c,chosenOrientation);
					playerDetails.put(i, p);
					sumOfAllBets += p.getBetValue();
				}
			}
			
			System.out.println("Player "+d.hostcontrol(playerDetails)+" Is The Winner Here is Your Bet amount "+sumOfAllBets);
			System.out.println("You Are The New Host ");
			System.out.println("Enter Y to continue or N to stop playing");
			host = d.hostcontrol(playerDetails);
			if(!s.next().equalsIgnoreCase("Y")) {
				continuegame = false;
				System.out.println("Thanks for Playing");
			}	
		}
	}


}
