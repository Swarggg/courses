package learning.java.stepik.spamFilter;

public class Filter {

    abstract class KeywordAnalyzer {

    }

    class SpamAnalyzer {

        //constructor
        private String[] keywords;
        public SpamAnalyzer (String[] incomeKeywords) {
            this.keywords= incomeKeywords;
        }

    }

    class NegativeTextAnalyzer {

    }

    class TooLongTextAnalyzer {

        private int maxLength;
        public TooLongTextAnalyzer (int incomeMaxLength) {
            this.maxLength=incomeMaxLength;
        }

    }


}


