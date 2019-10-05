package BlackJack;

import java.util.Scanner;

import PlayingCards.Card;

public class Casino {

	Scanner kb = new Scanner(System.in);
	
	public Casino() {

	}

	public void playBlackjack() {
			boolean keepLooping = true;
			BlackjackHand p1 = new PlayerHand();
			BlackjackHand d1 = new DealerHand();
			System.out.println("starting new round");
		do {
			PlayingCards.Deck deck = new PlayingCards.Deck();
			deck.shuffle();
			do {
				deck.dealCard();
				Card c1 = deck.dealCard();
				System.out.println(c1);
				p1.addCard(c1);
				Card c2 = deck.dealCard();
				d1.addCard(c2);
				Card c3 = deck.dealCard();
				p1.addCard(c3);
				Card c4 = deck.dealCard();
				d1.addCard(c4);
				
				System.out.println("cards dealt");
				System.out.println(p1.toString());
				System.out.println(d1.toString());
				
			} while (d1.handCards.size() < 1);
			if (deck.checkDeckSize() < 6)
				keepLooping = false;
			
			playerChoice();
			System.out.println("please stop");
		} while (keepLooping);

	}

	
		
	
	
	private void playerChoice() {
		System.out.println("1. Hit");
		System.out.println("2. Stand");
		
//		if (getHandValue == )
//		System.out.println("3. Split");
		int userInput = kb.nextInt();
	}
}
