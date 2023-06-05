public class Space
{
    String name;
    String description;
    boolean canBuy;

    //enums
    Color color;
    Type type;

    public Space(String name, String description, boolean canBuy, boolean isProperty, Color color, Type type)
    {
        this.name = name;
        this.description = description;
        this.canBuy = canBuy;

        this.color = color;
        this.type = type;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
}
