package learning.java.stepik.spamFilter;


    abstract class KeywordAnalyzer implements TextAnalyzer {
        private String[] keywords;
        Label label;

        protected Label getLabel() {
            return this.label;
        }

        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        public Label processText(String text) {
            return label;

        }
    }