import java.util.ArrayList;

public class GameBoard {

    private ArrayList<String> lines;
    public String filename;
    public static Space[] gameBoard;
    Deck<CommunityChest> community_chest_card_deck;
    Deck<Chance> chance_card_deck;
    Player [] players;

    /*
     * Description: 
     * Parameterized constructor for the gameboard;
     * This is the gameboard reference, so this should
     * allow filename, cc deck, c deck, and the player references
     */
    public GameBoard(String filename, Deck<CommunityChest> community, Deck<Chance> chance, Player ... players) 
    {
        this.filename = filename;
        this.community_chest_card_deck = community;
        this.chance_card_deck = chance;
        this.players = players;
    }

    // to string method that returns a linear array
    public String toString() {
        String string = "|";

        for (Space s : gameBoard) 
        {
            string += " " + s + " |";
        }

        return string;

    }

}