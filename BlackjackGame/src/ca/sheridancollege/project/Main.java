
package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author akash
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine(); // Allow the player to enter their name

        BlackjackGame game = new BlackjackGame(playerName);
        game.startGame();
    }
}
