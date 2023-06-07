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
        this.lines = new ArrayList<String>();
        this.filename = filename;

        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: add to gameBoard

        // Print the array elements
        for (Space line : gameBoard) {
            System.out.println(line);
        }
    }

    // to string method
    public String toString() {
        String string = "";

        for (Space s : gameBoard) {

        }

        return string;

    }

}