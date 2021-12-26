package learning.java.stepik.spamFilter;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    public String[] keywords = {":(", "=(", ":|"};
    private Label label = Label.NEGATIVE_TEXT;

    @Override
    public Label processText(String text) {

        return label;
    }

}

