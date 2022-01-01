package learning.java.stepik.spamFilter;

class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label = Label.SPAM;

    //constructor
    protected SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    protected String[] getKeywords() {
        return keywords;
    }

    protected Label getLabel() {
        return label;
    }








}
