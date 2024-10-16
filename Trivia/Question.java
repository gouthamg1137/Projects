import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Goutham Gopal
 * Question class, initalizes values for the trivia questions the program asks 
 */
public class Question {

    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Default constructor for the class
     * @param question takes in question value 
     * @param correctAnswer takes in correctAnswer value
     * @param answer takes in the string answer value
     */
    public Question(String question, int correctAnswer, String... answers) {
        this.question = question;
        this.correctAnswer = correctAnswer + 1;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }

    /**
     * Default toString method to print out values
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(question).append("\n");
        for (int i = 0; i < answers.size(); i++) {
            builder.append(" ").append(i + 1).append(". ").append(answers.get(i)).append("\n");
        }
        return builder.toString();
    }
    /**
     * Method to check to see if the answer is correct
     * @param userAnswer takes in the user's input
     * @return a true or false value showing if the answer is correct 
     */
    public boolean isCorrect(int userAnswer) {  
        return userAnswer == correctAnswer;
    }

    /**
     * Method to get the correct answer 
     * @return the correct answer
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer -1);
    }

}
