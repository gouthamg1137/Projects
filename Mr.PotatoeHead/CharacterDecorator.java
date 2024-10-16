import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    protected Character character;
    /*
     * Constructor method that takes extends a character
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.name);
        this.character = character;
    }

    /*
     * Method to out integrate the decor into the existing lines of the character 
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < lines.size() && i < decor.size(); i++) {
            lines.set(i, lines.get(i) + " " + decor.get(i));
        }
    }

    @Override
    public String toString() {
        return character.toString();
    }
}
