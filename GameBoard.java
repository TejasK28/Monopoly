import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GameBoard {

    private ArrayList<String> lines;
    public String filename;
    public static Space[] gameBoard;

    public GameBoard(String filename) 
    {
        
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