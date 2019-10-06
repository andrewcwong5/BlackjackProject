package BlackJack;

public class PlayerHand extends BlackjackHand {

	public PlayerHand() {
	}

	@Override
	public String toString() {
		return "Player Hand " + handCards + " total value: " + getHandValue();
	}
	
	
}
