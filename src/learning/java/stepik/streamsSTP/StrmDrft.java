package learning.java.stepik.streamsSTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StrmDrft {

    public static int seed = 13;


    public static IntStream pseudoRandomStream(int seed) {
       /* int r= seed;
        List<Integer> list = new ArrayList<>();
        list.add(r);

        for (int i=seed; i<25; i++ ) {
             r= ((r*r)%10000)/10;
            list.add (r);

        }*/
        return IntStream.iterate(seed, r-> ((r*r)%10000)/10);
    }

    public static void main(String[] args) {
          pseudoRandomStream(seed);

       // int b = (leed%10000)/10;

       // System.out.println("b="+b);

    }
}
