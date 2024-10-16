import java.util.ArrayList;

public class PotatoeHead extends Character {

/*
 * Constructor method to print out the body of Mr.PotatoeHead
 */
    public PotatoeHead(String name) {
        super(FileReader.getLines("C:\\Users\\gouth\\OneDrive\\Documents\\DesignPatterns\\decorator\\txt\\potatoe-head.txt"), name);  // Assuming the base character is read from a file
    }
}
