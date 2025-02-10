
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 *
 * @author akash
 */
public class Hand {
    private ArrayList<BlackjackCard> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(BlackjackCard card) {
        cards.add(card);
    }

    public int getScore() {
        int total = 0;
        int aceCount = 0;

        for (BlackjackCard card : cards) {
            total += card.getValue();
            if (card.getValue() == 11) {
                aceCount++;
            }
        }

        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public ArrayList<BlackjackCard> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}