import java.util.Scanner;

public class TriviaDriver {
    private static final String WIN_STRING = "YAY! You got it right!";
    private static final String LOSE_STRING = "You got it wrong!";
    private Scanner reader;
    private TriviaGame triviaGame;
    /**
     * Contructor Method
     */
    public TriviaDriver() {
        reader = new Scanner(System.in);
        triviaGame = TriviaGame.getInstance();
        System.out.println("Welcome to our trivia game");
    }
    /**
     * Method to continue looping while the play wants to keep playing
     */
    public void play() {
        while(true){
            System.out.print("(P)lay or (Q)uit: ");
            String command = reader.nextLine();

            if(command.equalsIgnoreCase("q")) break;

            if(!command.equalsIgnoreCase("p")) {
                System.out.println("Sorry, you must enter p or q");
                continue;
            }

            playRound();
        }

        System.out.println("\n" + triviaGame.getScores());
        System.out.println("Goodbye");
    }

    /**
     * Method to loop the rounds and allowing the user to continue playing
     */
    private void playRound() {

        Question question = triviaGame.getQuestion();
        System.out.println(question);

        while(true){
            System.out.print("Enter Answer: ");
            String ansText = reader.nextLine().trim();

            try {
                int userAnswer = Integer.parseInt(ansText);

                if(question.isCorrect(userAnswer)){
                    System.out.println(WIN_STRING);
                    triviaGame.winRound();
                    return;
                } else {
                    System.out.println(LOSE_STRING);
                    System.out.println("The correct answer is " + question.getCorrectAnswer());
                    triviaGame.loseRound();
                    return;
                }

            } catch (NumberFormatException ex){
                System.out.println("Sorry, you need to enter a number between 1 and 4");
            }
        }
    }

    /**
     * Main method
     * @param args String of argumetns
     */
    public static void main(String[] args){
        (new TriviaDriver()).play();
    }
}
