public class Space
{
    // instance variables
    String name;
    String description;
    boolean canBuy;
    Property propertyCard;

    //enums
    Color color;
    Type type;
    
    //parameterized constructor of Space
    public Space(String name, String description, boolean canBuy, boolean isProperty, Color color, Type type)
    {
        this.name = name;
        this.description = description;
        this.canBuy = canBuy;

        this.color = color;
        this.type = type;
    }

    // returns the name of the current spacee
    public String getName()
    {
        return this.name;
    }

    // returns the description
    public String getDescription()
    {
        return this.description;
    }
    
    // return Type of current space
    public Type getType()
    {
        return this.type;
    }

    //returns Color of current space
    public Color getColor()
    {
        return this.color;
    }

    //toString method for each space
    public String toString()
    {
        return this.name;
    }
    
}