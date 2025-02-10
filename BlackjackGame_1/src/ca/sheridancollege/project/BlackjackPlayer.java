
package ca.sheridancollege.project;

/**
 *
 * @author akash
 */
public class BlackjackPlayer extends Player {
    private Hand hand;

    public BlackjackPlayer(String name) {
        super(name);
        this.hand = new Hand();
    }

    public void hit(Deck deck) {
        hand.addCard(deck.dealCard());
    }

    public int getScore() {
        return hand.getScore();
    }

    // ✅ Correctly provide access to the hand
    public Hand getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return getName() + "'s hand: " + hand.toString() + " (Score: " + getScore() + ")";
    }
    
}
