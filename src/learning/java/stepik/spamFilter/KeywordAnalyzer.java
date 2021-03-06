package learning.java.stepik.spamFilter;

    abstract class KeywordAnalyzer implements TextAnalyzer {

        protected abstract Label getLabel();

        protected abstract String[] getKeywords();

        @Override
        public Label processText(String text) {
            for (int i=0; i< getKeywords().length; i++ ) {
                if (text.contains(getKeywords()[i])) { return getLabel();}
            }
            return Label.OK;
        }
    }