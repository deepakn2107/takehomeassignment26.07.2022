package takeHomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Deck {
private List<Card> deckOfCards;
	
	public Deck() {
		this.deckOfCards = orderedListOfCards();
	}

	public List<Card> orderedListOfCards() {
		List<Card> deckOfCards = new ArrayList<Card>();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
				Card c = new Card(j,i);
				deckOfCards.add(c);
			}
		}
		return deckOfCards;
	}
	
	public List<Card> shuffleTheDeck(){
		Collections.shuffle(deckOfCards);
		return deckOfCards;
	}
	

	public int hostcontrol(Map<Integer, Player> playerDetails) {
		List<Card> list = shuffleTheDeck();
		int host = 0;
			Card in = list.remove(0);
			Card out = list.remove(0);
			for(Map.Entry<Integer, Player> element : playerDetails.entrySet()) {
				if(element.getValue() == null) {
					host = element.getKey();
				}
				else if((in == element.getValue().getChosenCard() && element.getValue().getChosenOrientation().equalsIgnoreCase("IN"))
						|| (out == element.getValue().getChosenCard() && element.getValue().getChosenOrientation().equalsIgnoreCase("OUT"))) {
					return element.getKey();
				}
			}
			return host;
	}


}
