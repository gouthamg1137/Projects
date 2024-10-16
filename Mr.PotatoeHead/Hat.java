import java.util.ArrayList;

public class Hat extends CharacterDecorator {
    /*
     * Constructor method to retrieve the arrayList values of strings for the hat and prints it out
     */
    public Hat(Character character) {
        super(character);
        ArrayList<String> hatArt = FileReader.getLines("C:\\Users\\gouth\\OneDrive\\Documents\\DesignPatterns\\decorator\\txt\\hat.txt");
        integrateDecor(hatArt);
    }
}
