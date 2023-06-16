import java.util.*;

public class Dice 
{
    private int firstRoll;
    private int secondRoll;
    private Random random;
    private int number_of_doubles;
    private int counter;

    public Dice()
    {
        this.firstRoll = 0;
        this.secondRoll = 0;
        this.random = new Random();
        this.counter = 0;
    }

    /*
     * Computes 2 random ints and adds them together
     * @returns the combination of the two ints
     */
    public int getRoll()
    {
        this.firstRoll = (this.random.nextInt(6) + 1);
        this.secondRoll = (this.random.nextInt(6) + 1);
        
        int sum = this.firstRoll + this.secondRoll;

    
        return sum;
    }


    
}
