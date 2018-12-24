import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class in charge of providing random questions for the trivia.
 * Holds an int representing the number of types of questions it can create, so it can create a random type.
 * Holds a list of asked questions, so no question repeats itself.
 * Also holds Randy, a pretty cool guy in charge of giving us random numbers .
 */
public class QuestionFactory implements Factory {
    private DataRetriever dataRetriever;
    private ArrayList<Question> askedQuestions;
    private Random randy;
    private int questionTypesNum = 5;


    QuestionFactory() {
        dataRetriever = new DataRetriever();
        randy = new Random();
    }

    /**
     * Here the magic happens. This method creates a random question based on the data.
     * @return
     */
    public Question NextQuestion() {
        int i = randy.nextInt(questionTypesNum);

        //TODO

        return new Question();
    }

    @Override
    public boolean CheckIfQuestionIsNew(Question question) {
        foreach (Question question, )
    }

    public ArrayList<Question> getAskedQuestions() {
        return askedQuestions;
    }

    public void setAskedQuestions(ArrayList<Question> askedQuestions) {
        this.askedQuestions = askedQuestions;
    }
}
