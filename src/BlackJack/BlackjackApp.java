package BlackJack;

import java.util.Scanner;

public class BlackjackApp {

	Casino cas = new Casino();
	Scanner kb = new Scanner(System.in);
	private boolean endProgram = false;
	
	public static void main(String[] args) {

		BlackjackApp bApp = new BlackjackApp();
		
		bApp.run();	
	}

	private void run() {
		do {
			mainMenu();
		} while(endProgram == false);
	}
	
	private void mainMenu() {
		System.out.println("************************");
		System.out.println("|1. Play BlackJack     |");
		System.out.println("|2. Check chip balance |");
		System.out.println("|3. Leave casino       |");
		System.out.println("************************");
		
		int userInput = kb.nextInt();
		
		switch (userInput) {
		
		case 1:
			cas.playBlackjack();
			break;
		case 2:
			System.out.println("Feature coming soon");
			break;
		case 3:
			System.out.println("Thanks for playing. End of Program");
			endProgram = true;
			break;
		default:
			System.out.println("Invalid selection, choose again 1-5");
			break;
		}
	}

}
