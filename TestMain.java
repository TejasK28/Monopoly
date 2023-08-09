public class TestMain
{
    public static void main(String [] args)
    {

        Player p1 = new Player("Tejas", new Bank(), new Deck<Chance>(), new Deck<CommunityChest>(), new Property(null), new Space(null, null, false, false, null, null), new Dice());
        Monopoly game = new Monopoly(p1);
    }
}