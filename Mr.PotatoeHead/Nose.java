import java.util.ArrayList;

public class Nose extends CharacterDecorator {
    /*
     * Constructor method to print out arrayList of values for nose and prints it out
     */
    public Nose(Character character) {
        super(character);
        ArrayList<String> noseArt = FileReader.getLines("C:\\Users\\gouth\\OneDrive\\Documents\\DesignPatterns\\decorator\\txt\\nose.txt");
        integrateDecor(noseArt);
    }
}
