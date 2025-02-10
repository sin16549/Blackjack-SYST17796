
package ca.sheridancollege.project;

/**
 *
 * @author akash
 */
public class Deck extends GroupOfCards {
    public Deck() {
        super();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new BlackjackCard(suit, ranks[i], values[i]));
            }
        }
        shuffle();
    }

    public BlackjackCard dealCard() {
        return (BlackjackCard) cards.remove(cards.size() - 1);
    }
    
}
