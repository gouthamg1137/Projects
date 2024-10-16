import java.util.ArrayList;

public class Eyes extends CharacterDecorator {
    /*
     * Constructor method to get the arrayList of strings for the eyes and prints it out
     */
    public Eyes(Character character) {
        super(character);
        ArrayList<String> eyesArt = FileReader.getLines("C:\\Users\\gouth\\OneDrive\\Documents\\DesignPatterns\\decorator\\txt\\eyes.txt");
        integrateDecor(eyesArt);
    }
}
