import java.util.ArrayList;

public class Ears extends CharacterDecorator {
    /*
     * Constructor method to get the arrayList of strings for the ears and prints them out
     */
    public Ears(Character character) {
        super(character);
        ArrayList<String> earsArt = FileReader.getLines("C:\\Users\\gouth\\OneDrive\\Documents\\DesignPatterns\\decorator\\txt\\ears.txt");
        integrateDecor(earsArt);
    }
}
