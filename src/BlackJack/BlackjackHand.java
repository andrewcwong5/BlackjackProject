package BlackJack;

import PlayingCards.Card;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		
	}
	
	public boolean isBlackjack() {
		if (getHandValue() == 21)
		return true;
		else 
		return false;
	}
	public boolean isBust() {
		if (getHandValue() > 21)
		return true;
		else
		return false;
	}

	@Override
	public int getHandValue() {
		int totalValue = 0;
		for (Card card : handCards)
		totalValue += card.getValue();
		return totalValue;
	}
}
