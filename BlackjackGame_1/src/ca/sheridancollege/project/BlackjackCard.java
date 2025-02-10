
package ca.sheridancollege.project;

/**
 *
 * @author akash
 */
public class BlackjackCard extends Card {
      private String suit;
    private String rank;
    private int value;

    public BlackjackCard(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    
}
