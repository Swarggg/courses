package learning.java.stepik.spamFilter;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;
    private Label label = Label.SPAM;

    //constructor
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
}
