import java.util.*;

public class Deck <T>
{
    // Instance variable of Deck<T>
    T [] stack;
    
    // Default constructor
    public Deck()
    {
        this.stack = null;
    }
    
    //Constructor of Deck class for generic type <T>
    //Instantiates the stack array and shuffles 13 times
    public Deck(T [] stack)
    {
       this.stack = stack;
       shuffle(13);
    }

    //adds card to the stack
    public void addDeck(T [] stack)
    {
        this.stack = stack;
    }

    // shuffles Deck<T>
    // @returns true when done
    public boolean shuffle(int numOfShuffles)
    {
        Random rand = new Random();
        for(int j = 0; j < numOfShuffles; j++)
            for(int i = 0; i < stack.length; i++)
            {
                int randInt = rand.nextInt(stack.length);

                T temp = stack[randInt];
                stack[randInt] = stack[i];
                stack[i] = temp;
            }
            return true;
    }
    
} // end of class