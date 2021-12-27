package learning.java.stepik.spamFilter;

import java.util.Arrays;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords = {":(", "=(", ":|"};
    private Label label =Label.NEGATIVE_TEXT;



    protected String[] getKeywords() {
        return this.keywords;
    }

    protected Label getLabel() {
        return this.label;
    }

}

