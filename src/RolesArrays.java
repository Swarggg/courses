import java.util.Arrays;

public class RolesArrays {

    public static void main(String[] args) {

        String [] roles1= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines1={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Городничий: Господа, сообщаю вам пренеприятное известие, его поведал мне Артемий Филиппович: к нам едет ревизор.",
                "Аммос Федорович: Городничий Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles1, textLines1));

    }

    public static String printTextPerRole(String[] roles, String[] textLines) {

        int rowsQuantity = textLines.length;
        int rolesQuantity = roles.length;

        String screenplay = new String ("");

        for (int j=0; j<rolesQuantity; j++) {

            screenplay = screenplay+roles[j]+":\n";

            for (int i = 0; i < rowsQuantity; i++) {

                if (textLines[i].contains(roles[j] + ":")) {
                    screenplay = screenplay+Integer.toString(i + 1) + ")" + textLines[i].replace(roles[j]+":","")+"\n";
                        }
                if (i==rowsQuantity-1) {
                    screenplay=screenplay+"\n";
                }

            }
        }
        return screenplay;
    }
}