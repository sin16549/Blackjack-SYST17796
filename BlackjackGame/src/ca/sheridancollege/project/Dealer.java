package ca.sheridancollege.project;

/**
 * Represents the dealer in Blackjack.
 */
public class Dealer extends BlackjackPlayer {
      public Dealer() {
        super("Dealer");
    }

    public void playTurn(Deck deck) {
        while (getScore() < 17) {
            hit(deck);
        }
    }

    public BlackjackCard getFirstCard() {
        return getHand().getCards().get(0);
    }
}