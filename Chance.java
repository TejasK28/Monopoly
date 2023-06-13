public class Chance extends Card
{

    //Instance variables for a Chance card
    String prompt;
    ChanceType chanceType;

    //Constructor for Chance
    public Chance(String prompt, ChanceType chanceType)
    {
        this.prompt = prompt;
        this.chanceType = chanceType;
    }

    public String toString()
    {
        return (this.prompt + " : " + this.chanceType);
    }


}
