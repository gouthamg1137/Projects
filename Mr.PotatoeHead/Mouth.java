import java.util.ArrayList;

public class Mouth extends CharacterDecorator {
    /*
     * Constructor method to retrieve arrayList of string values for the mouth and prints it out
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> mouthArt = FileReader.getLines("C:\\Users\\gouth\\OneDrive\\Documents\\DesignPatterns\\decorator\\txt\\mouth.txt");
        integrateDecor(mouthArt);
    }
}
