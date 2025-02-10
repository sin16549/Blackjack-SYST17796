
package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author akash
 */
public class BlackjackGame extends Game {
    private Deck deck;
    private BlackjackPlayer player;
    private Dealer dealer;
    private Scanner scanner;

    public BlackjackGame(String playerName) {
        super("Blackjack");
        this.deck = new Deck();
        this.player = new BlackjackPlayer(playerName);
        this.dealer = new Dealer();
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        boolean playAgain = true;

        while (playAgain) {
            deck = new Deck(); // Reset the deck for a new round
            player = new BlackjackPlayer(player.getName()); // Reset the player
            dealer = new Dealer(); // Reset the dealer

            player.hit(deck);
            player.hit(deck);
            dealer.hit(deck);
            dealer.hit(deck);

            System.out.println(player);
            System.out.println("Dealer's hand: [" + dealer.getFirstCard() + ", Hidden Card]");

            while (player.getScore() < 21) {
                System.out.print("Hit or Stand? ");
                String action = scanner.nextLine().toLowerCase();
                if (action.equals("hit")) {
                    player.hit(deck);
                    System.out.println(player);
                } else {
                    break;
                }
            }

            dealer.playTurn(deck);
            System.out.println(dealer);
            checkWinner();

            // Ask the player if they want to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing! Goodbye.");
    }

    private void checkWinner() {
        if (player.getScore() > 21) {
            System.out.println("Player busts! Dealer wins.");
        } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
            System.out.println("Player wins!");
        } else if (player.getScore() == dealer.getScore()) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Dealer wins.");
        }
    }

    
}
