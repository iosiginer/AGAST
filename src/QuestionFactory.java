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
    private int questionTypesNum = 1;   // TODO: this is the number of implemented question types. If you add one, add here


    QuestionFactory() {
        dataRetriever = new DataRetriever();
        randy = new Random();
    }

    /**
     * Here the magic happens. This method creates a random question based on the data.
     * @return
     */
    public Question NextQuestion() {
        int type = randy.nextInt(questionTypesNum);
        switch(type) {
            case 1: return createSongToArtistQuestion();
        }
        //TODO

        return null;
    }

    private Question createSongToArtistQuestion() {
    }

    @Override
    public boolean CheckIfQuestionIsNew(Question question) {
        //TODO: loop to check if question was asked before.
        //loop
        boolean isRepeated = false;
        if(question.GetQuestion().equals(currentQuestion.GetQuestion())) {
            isRepeated = true;
        }
        return isRepeated;
    }

    public ArrayList<Question> getAskedQuestions() {
        return askedQuestions;
    }

    public void setAskedQuestions(ArrayList<Question> askedQuestions) {
        this.askedQuestions = askedQuestions;
    }
}
