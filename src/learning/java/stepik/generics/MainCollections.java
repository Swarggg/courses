package learning.java.stepik.generics;

import java.util.ArrayList;
import java.util.Scanner;


public class MainCollections {

    public static void main (String[] args) {

        ArrayList<Integer> listOfInputInt = new ArrayList<>();

        Scanner input = new Scanner("1 2 3 4 5 6 7");

        int count=1;

        while (input.hasNext()) {
            if (count % 2 == 0) {
                listOfInputInt.add(input.nextInt());
                count++;
            }
            else {
                input.nextInt();
                count++;
            }
        }
        System.out.println("listOfInputInt="+listOfInputInt);
        System.out.println("listOfInputInt.size="+listOfInputInt.size());

        //listOfInputInt.remove(1);
/*
        for (int i =0; i< listOfInputInt.size(); i++) {
            listOfInputInt.remove(i);
        }
*/
        System.out.println("del any 2 listOfInputInt="+listOfInputInt);

        System.out.println("listOfInputInt.size after cut="+listOfInputInt.size());

        for (int i=listOfInputInt.size()-1; i>=0; i-- ) {
            System.out.print(listOfInputInt.get(i)+" ");
        }

    }

}
