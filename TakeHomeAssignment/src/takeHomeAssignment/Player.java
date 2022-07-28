package takeHomeAssignment;

public class Player {

	private int playerId;
	private double betValue;
	private Card chosenCard;
	private String chosenOrientation;
	
	public Player() {}

	public Player(int playerId, double betValue, Card chosenCard, String chosenOrientation) {
		this.playerId = playerId;
		this.betValue = betValue;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public double getBetValue() {
		return betValue;
	}

	public void setBetValue(double betValue) {
		this.betValue = betValue;
	}

	public Card getChosenCard() {
		return chosenCard;
	}

	public void setChosenCard(Card chosenCard) {
		this.chosenCard = chosenCard;
	}

	public String getChosenOrientation() {
		return chosenOrientation;
	}

	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}
	
}
