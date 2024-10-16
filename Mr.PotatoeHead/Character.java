import java.util.ArrayList;

public class Character {
    protected String name;
    protected ArrayList<String> lines;

    /*
     * Constructor method that takes in an arrayList of lines and a name
     */
    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }
    /*\
     * Method to get the name of the character
     */
    public String getName() {
        return name;
    }

    /*
     * Method to print out string representation of object
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
