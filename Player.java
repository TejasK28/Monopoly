// TODO: Implement constructor

public class Player
{
    String name;
    Bank bank;
    Deck<Chance> chance_deck;
    Deck<CommunityChest> communinty_chest_deck;
    Property property_owned;
    Space currSpace;

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



    

    

}
