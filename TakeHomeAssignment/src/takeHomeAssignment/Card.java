package takeHomeAssignment;

public class Card {
	private int rank;
	private int suit;

	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	public static final int SPADES = 1;
	public static final int HEARTS = 2;
	public static final int DIAMONDS = 3;
	public static final int CLUBS = 4;

	private static final String SPADES_STRING = "S";
	private static final String HEARTS_STRING = "H";
	private static final String DIAMONDS_STRING = "D";
	private static final String CLUBS_STRING = "C";

	private static final String ACE_STRING = "A";
	private static final String JACK_STRING = "J";
	private static final String QUEEN_STRING = "Q";
	private static final String KING_STRING = "K";

	public Card(int rank, int suit) {
		if ((rank >= ACE && rank <= KING) && (suit >= SPADES && suit <= CLUBS)) {
			this.rank = rank;
			this.suit = suit;
		} else {
			System.out.println("Invalid rank and/or suit; Card initialized with zero values");
		}
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	public Boolean isValid() {
		return (rank >= ACE && rank <= KING) && (suit >= SPADES && suit <= CLUBS);
	}

	public void setRank(int rank) {
		if (rank >= ACE && rank <= KING) {
			this.rank = rank;
		} else {
			System.out.println("Invalid rank value");
		}
	}

	public void setSuit(int suit) {
		if (suit >= SPADES && suit <= CLUBS)
			this.suit = suit;

		else
			System.out.println("Invalid suit value");

	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;

	}

	public String toString() {
		String suitString = "";
		String rankString = "";
		switch (suit) {
		case SPADES:
			suitString = SPADES_STRING;
			break;
		case DIAMONDS:
			suitString = DIAMONDS_STRING;
			break;
		case HEARTS:
			suitString = HEARTS_STRING;
			break;
		case CLUBS:
			suitString = CLUBS_STRING;
			break;
		}
		switch (rank) {
		case ACE:
			rankString = ACE_STRING;
			break;
		case JACK:
			rankString = JACK_STRING;
			break;
		case QUEEN:
			rankString = QUEEN_STRING;
			break;
		case KING:
			rankString = KING_STRING;
			break;
		default:
			rankString = String.valueOf(rank);
		}
		return rankString + suitString;
	}

}
