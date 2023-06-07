// Monopoly class is where the mechanics are defined

public class Monopoly 
{
    //instance variables of chance cards and community chest cards
    Deck<Chance> chance_deck = new Deck<Chance>();
    Deck<CommunityChest> community_chest_deck = new Deck<CommunityChest>();

    /*
     * instance variable of gameboard
     * configure appropriate filename as argument
     */
    GameBoard gameBoard = new GameBoard();

    /*
     * instance variable of player_1
     * arguments are
     * 1. name
     * 2. bank reference
     * 3. chance_deck referencee
     * 4. community chest reference
     * 5. properties owned
     * 6. current space
     */

    Player player_1 = new Player();

    Card card = new Chance();

    
}
