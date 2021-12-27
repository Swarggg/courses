package learning.java.stepik.spamFilter;


import java.util.Arrays;

public class TextFiltering {

    public static void main(String[] args) {
        String comment1 = "run Forrest Run"; //
        String comment2 = "Run Forrest =( Ruuun";
        String comment3 = " film Forrest Gump=( Buy forrest";
        String comment = comment1;

        String [] negativeText = {":(", "=(", ":|"};
        String [] spamExample = {"Go to", "Buy", "click on link"};

        //объект
        TooLongTextAnalyzer text1 = new TooLongTextAnalyzer(14);
        //System.out.println();
        System.out.println("проверка на длину "+comment+": .... "+text1.processText(comment));
        System.out.println();
        NegativeTextAnalyzer neg = new NegativeTextAnalyzer();

        System.out.println("результат neg с comment: "+neg.processText(comment));


        System.out.println();
        SpamAnalyzer spam = new SpamAnalyzer(spamExample);
        System.out.println("результат spam с comment: "+spam.processText(comment));

        TextAnalyzer[] analyzers = {new TooLongTextAnalyzer(14),
                                    new NegativeTextAnalyzer(),
                                    new SpamAnalyzer(spamExample) };

    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for (int i=0; i<analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        } return Label.OK;

    }



}
