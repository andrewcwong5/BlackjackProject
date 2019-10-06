package BlackJack;

public class DealerHand extends BlackjackHand {

	public DealerHand() {
	}
	@Override
	public String toString() {
		return "Dealer Hand " + handCards + " total value: " + getHandValue();
	}
	public String hiddenCard() {
		return "Dealer Hand [Hidden card]" + handCards + "total value: " + getHandValue();
	}
}
