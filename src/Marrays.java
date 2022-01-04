import java.util.Arrays;
import java.util.logging.Logger;

public class Marrays {

    public static void main(String[] args) {
        String[] seasons = new String[4];

        seasons[0] = "summer";
        seasons[1] = "autumn";
        seasons[2] = "winter";
        seasons[3] = "spring";

/*
        String [] lodki = new String[] {"201", "202", "203", "204"};

        String [] brothersNames = {"Sasha", "Vova"};

        System.out.println(lodki[2].toString());
        System.out.println(Arrays.toString(lodki));

        for (int i=0; i<4; i++) {
            System.out.println(seasons[i]);
        }
*/


        int[] a1 = {2, 2, 4, 6};
        int[] a2 = {1, 1, 3, 9};


        int[] a3 = new int[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

        if (i > a1.length-1) { //проверка, не закончился ли массив а1
            a3[k]= a2[j];
            j++;
        } else if (j> a2.length-1) { //проверка, не закончился ли массив а2
            a3[k] = a1[i];
            i++;
        } else if (a1[i] < a2[j]) { //сравнение и запись в итоговый массив
            a3[k] = a1[i];
            i++;
            } else {
            a3[k] = a2[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(a3));
        //System.out.println(Marrays.class.getName());

    }
}
