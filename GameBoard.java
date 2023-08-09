import java.util.ArrayList;
import java.io.*;


public class GameBoard {

    private ArrayList<String> lines;
    private String filename;
    public static Space[] gameBoard;
    private Deck<CommunityChest> community_chest_card_deck;
    private Deck<Chance> chance_card_deck;
    private Player [] players;

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

        makeGameBoard();
    }

    /*
        Description: 
            This is the method to populate the gameboard conistsed of spaces
     */
    public void makeGameBoard()
    {
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) 
        {
        String line;
        while ((line = br.readLine()) != null) {
            // Process each line here
            System.out.println(line); // Or perform any operation on 'line' as needed
            Space tempSpace = new Space();
        }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
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