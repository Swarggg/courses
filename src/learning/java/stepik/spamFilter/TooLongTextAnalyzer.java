package learning.java.stepik.spamFilter;

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;
    private int textLength;

    //constructor
    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        textLength = text.length();
        if (textLength > maxLength) {
            return Label.TOO_LONG;
        } else return Label.OK;
    }

}
