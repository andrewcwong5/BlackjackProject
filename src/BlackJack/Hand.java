package BlackJack;

import java.util.ArrayList;
import java.util.List;

import PlayingCards.Card;

public abstract class Hand {

	protected List<Card> handCards = new ArrayList<>();
	
	public abstract int getHandValue();
	
	public void addCard(Card c) {
		handCards.add(c);
	}
	public void clear() {
		handCards.removeAll(handCards);
	}
	public List<Card> getHandCards() {
		return handCards;
	}
//	public void setHandCards(List<Card> handCards) {
//		this.handCards = handCards;
//	}
	@Override
	public String toString() {
		return "Hand " + handCards;
	}
	
	
	
	
	
	
	
	
}
