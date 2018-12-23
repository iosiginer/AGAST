import java.util.ArrayList;

/**
 * Parent class for all the question types.
 * Holds two strings: the interrogative, which is the basic phrasing of the question,
 * and the correct answer. Also holds a list of the options given to the user.
 */
public abstract class Question {

    private String interrogative;
    private ArrayList<String> options;
    private String correctAnswer;

    Question(String interrogative, ArrayList<String> options, String correctAnswer) {
        this.setInterrogative(interrogative);
        this.setOptions(options);
        this.setCorrectAnswer(correctAnswer);
    }

    public abstract String GetQuestion();

    public boolean CheckAnswer(String givenAnswer) {
        return givenAnswer.equals(correctAnswer);
    }

    public String getInterrogative() {
        return interrogative;
    }

    public void setInterrogative(String interrogative) {
        this.interrogative = interrogative;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
