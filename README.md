//Overview
Blackjack is a card game where the objective is to beat the dealer by getting cards whose values total as close to 21 without going over. The app starts at the main menu where you play select option 1 to start a game of blackjack.

The deck is shuffled, a round is started, and starting hands are dealt. The dealer is only dealt one card since his other card is supposed to be hidden anyway. Then the player has the option to hit or stay with current hand. If they hit a card will be added to their hand. If they stay the dealer will run through their logic of hitting until they get to 17 or higher. The hand values will be compared between player and dealer and a winner or push will be declared.Then the user will be asked if they want to play another round.

For the most part I stuck to the UML. I made a blackjackapp class to run the main method. I also created a Casino object class for a place for all the objects to interact. Instead of making a separate Person parent object class and have player and dealer extend from that. I just extended blackjack hand to have a playerhand and dealerhand.



// Technologies/Topics Applied
Encapsulation was used to make all the necessary fields private.
Polymorphism was useful for getting the values and unique tostring outputs for 2 separate similar objects like a player hand and dealer hand.

// Lessons Learned
Enums are very useful for creating fields in an object class
