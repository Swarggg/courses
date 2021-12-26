package learning.java.stepik.spamFilter;


import java.util.Arrays;

public class TextFiltering {




    public static void main(String[] args) {
        String comment1 = "run Forrest Run"; //
        String comment2 = "Run Forrest =(";
        String comment3 = "Buy film Forrest Gump=( Buy";

        //String [] negativeText = {":(", "=(", ":|"};
        //String [] spamExample = {"Buy", "click on link"};

        //объект
        TooLongTextAnalyzer text1 = new TooLongTextAnalyzer(14);
        //System.out.println();
        System.out.println("проверка на длину "+comment1+": .... "+text1.processText(comment1));

        NegativeTextAnalyzer neg = new NegativeTextAnalyzer();
        System.out.println(Arrays.toString(neg.getKeywords()));

        System.out.println(neg.processText(comment2));




    }

}
