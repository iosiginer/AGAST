public interface Factory {
    Question NextQuestion();
    boolean CheckIfQuestionIsNew(Question question);
}
