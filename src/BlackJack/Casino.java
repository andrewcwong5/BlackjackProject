package BlackJack;

import java.util.Scanner;

import PlayingCards.Card;

public class Casino {

	Scanner kb = new Scanner(System.in);
	BlackjackHand p1 = new PlayerHand();
	BlackjackHand d1 = new DealerHand();
	
	PlayingCards.Deck deck = new PlayingCards.Deck();
	private boolean keepLooping = true;
	private boolean newRound = false;
	
	public Casino() {

	}

	public void playBlackjack() {
		
		 while (keepLooping == true) {
			
			deck.shuffle();
			System.out.println("Starting new round");
			newRound = false; p1.clear(); d1.clear();
			
			while (newRound == false) { 
				while (p1.handCards.size() < 2) {
				
					Card c1 = deck.dealCard();
					p1.addCard(c1);
					Card c2 = deck.dealCard();
					d1.addCard(c2);
					Card c3 = deck.dealCard();
					p1.addCard(c3);
					p1.isBlackjack();
					d1.isBlackjack();
					
					gameStatus();
					blackJackCheck();
					
				} 
					if (deck.checkDeckSize() < 10) {
						keepLooping = false;
					}
				if (keepLooping == false) 
					break;
				
				playerChoice();			
			}			
		} 
	}

	private void playerChoice() {
		System.out.println("1. Hit");
		System.out.println("2. Stand");
		
//		if (getHandValue == )
//		System.out.println("3. Split");
		int userInput = kb.nextInt();
		
		switch (userInput) {
		
		case 1:
			Card c = deck.dealCard();
			p1.addCard(c);
			p1.isBust();
			gameStatus();
			playerStatus();
			break;
		case 2: //dealer turn
			while (d1.getHandValue() < 17) {
				Card c2 = deck.dealCard();
				d1.addCard(c2); 
				System.out.println("Dealer hits");
				d1.isBust();
				gameStatus();
			}
			dealerStatus();
			break;
		default:
			System.out.println("Invalid selection, choose again 1-5");
			break;
		}
	}
	private void gameStatus() {
		System.out.println("Cards dealt");
		System.out.println(p1.toString());
		System.out.println(d1.toString());
		System.out.println("Deck size: " + deck.checkDeckSize()+"\n");
	}
	private void playerStatus() {
		
		if (p1.isBlackjack() == true ) {
			System.out.println("Blackjack. You win this round. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
			
		}
		if (p1.isBust() == true) {
			System.out.println("You busted, you lose. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
		
	}
	private void dealerStatus() {
		if (d1.isBust() == true) {
			System.out.println("Dealer busted. You win! Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
		else if (p1.getHandValue() == d1.getHandValue()) {
			System.out.println("Push, you and the dealer tied. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
		else if (p1.getHandValue() > d1.getHandValue()) {
			System.out.println("You win, your hand was better. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
		else if (p1.getHandValue() < d1.getHandValue()) {
			System.out.println("You lose, dealers hand was better. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
	}
	private void playAgain(String input) {
		String yOrN = input;
		if (yOrN.equals("yes")) {
			newRound = true;
		}
		else {
			newRound = false;
			keepLooping = false;
			System.out.println("Thanks for playing, back to main menu.");
		}
	}
	private void blackJackCheck() {
		playerStatus();
		if (d1.isBlackjack() == true && p1.isBlackjack() == true) {
			System.out.println("Push, both you and deal got blackjack. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
		else if(d1.isBlackjack() == true ) {
			System.out.println("Dealer got blackjack, you lose. Play again? yes or no");
			String input = kb.next();
			playAgain(input);
		}
	}

}
