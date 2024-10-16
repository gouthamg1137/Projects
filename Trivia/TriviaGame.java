
import java.util.ArrayList;
import java.util.Random;
/**
 * @author Goutham Gopal
 * TrivaGame class intializes the values of a trivia game
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames; 
    private Random rand;
    private ArrayList<Question> question;

    /**
     * Constructor method, initializes the class
     */
    public TriviaGame() {
        this.score = 0;
        this.numGames = 0;
        this.rand = new Random();
        this.question = DataLoader.getTriviaQuestions();

    }

    /**
     * Method that retrieves the instance of TriviaGame
     * @return the instance of the game
     */
    public static TriviaGame getInstance() {
        if(triviaGame == null) {
            System.out.println("Creating Trivia Game...");
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Method to get the questions
     * @return
     */
    public Question getQuestion() { 
        int index = rand.nextInt(question.size());
        return question.get(index);
    }

    /**
     * Method to check and see if there are more questions to be asked 
     * @return the boolean value
     */
    public boolean hasMoreQuestions() {
        boolean value = true;
        while(!question.isEmpty()) {
            value  = false; 
        }
        return value;
    }

    /**
     * Method to invrement the value once a user wins a round
     */
    public void winRound() {
        score++;
        numGames++;

    }

    /**
     * Method to increment the value of number of games once the user loses a round
     */
    public void loseRound() {
        numGames++;
    }


    /**
     * Method to get the score
     * @return the score 
     */
    public String getScores() {
        return "You've Scored " + score + "/" + numGames;
    }

}
