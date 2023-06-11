// TODO: Implement constructor

public class Player
{
    String name;
    Bank bank;
    Deck<Chance> chance_deck;
    Deck<CommunityChest> communinty_chest_deck;
    Property property_owned;
    Space currSpace;

    /*
     * Constructor for creating a new Player instance
     * Parameters: name, bank reference, community chest reference, chance reference, and current space 
     */
    public Player(String name, Bank bank, Deck<Chance> chance_deck, Deck<CommunityChest> communinty_chest_deck, Property property_owned, Space currSpace)
    {
        this.name = name;
        this.bank = bank;
        this.chance_deck = chance_deck;
        this.communinty_chest_deck = communinty_chest_deck;
        this.property_owned = property_owned;
        //this.currSpace should always be on GO
        this.currSpace = currSpace;
    }

    /*
     * Method   
     * Parameters: property to buy
     * Returns: true if property is succesfully acquired
     */
    public boolean buy(Space property)
    {

    }

    /*
     * Method
     * Parameters: property to auction
     * Returns: true if property is succesfully auctioned
     */
    public boolean auction(Space property)
    {

    }

    /*
     * Method
     * Parameters: none
     * Returns: true if player lands 3 doubles and ends up in jail
     */
    public boolean goToJail()
    {

    }

    

}
