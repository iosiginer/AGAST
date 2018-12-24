import java.util.ArrayList;

public class SongToArtistQuestion extends Question {
    private String phrasing = "Which of the following artists plays the song %s ?";
    private String songForQuestion;


    SongToArtistQuestion(ArrayList<String> options, String correctAnswer, String songForQuestion) {
        super(options, correctAnswer);
        this.setSongForQuestion(songForQuestion);
    }

    @Override
    public String GetQuestion() {
        return String.format(this.getPhrasing(), this.getSongForQuestion());
    }

    public String getSongForQuestion() {
        return songForQuestion;
    }

    public void setSongForQuestion(String songForQuestion) {
        this.songForQuestion = songForQuestion;
    }
}
