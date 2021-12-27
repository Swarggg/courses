package learning.java.stepik.spamFilter;

import java.util.Arrays;

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

    @Override
    public Label processText(String text) {
        int detector=0;

        for (int i=0; i< getKeywords().length; i++ ) {
            if (text.contains(getKeywords()[i])) { detector++;}
        }

        if (detector>0) {label=getLabel();} else label=Label.OK;

        return label;
    }







}
