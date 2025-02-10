
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 *
 * @author akash
 */
public abstract class Game {
    private final String name;  // The title of the game
    private ArrayList<Player> players; // List of players in the game

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
}
